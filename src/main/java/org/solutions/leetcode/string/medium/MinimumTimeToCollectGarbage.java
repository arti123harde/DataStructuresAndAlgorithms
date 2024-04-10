package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class MinimumTimeToCollectGarbage {

    public static void main(String[] args) {
        System.out.println(garbageCollection(new String[]{"G","P","GP","GG"},
                new int[]{2,4,3}));
        System.out.println(garbageCollection(new String[]{"MMM","PGM","GP"},
                new int[]{3,10}));
    }

    public static int garbageCollection(String[] garbage, int[] travel) {
        int count = 0;
        int mc = 0;
        int pc = 0;
        int gc = 0;
        for(int i=0; i<garbage.length; i++){
            if(garbage[i].contains("M")){
                count = count + getTime(garbage[i], 'M') + getDistance(mc, i, travel);
                mc = i;
            }
            if(garbage[i].contains("P")){
                count = count + getTime(garbage[i], 'P') + getDistance(pc, i, travel);
                pc = i;
            }
            if(garbage[i].contains("G")){
                count = count + getTime(garbage[i], 'G') + getDistance(gc, i, travel);
                gc = i;
            }
        }
        return count;
    }

    public static int getTime(String s, char garbage){
        int count = 0;
        for(char c: s.toCharArray()){
            if(c == garbage){
                count++;
            }
        }
        return count;
    }

    public static int getDistance(int start, int end, int[] travel){
        int distance = 0;
        if(start != end){
            for(int k=start; k<=end-1; k++){
                distance = distance + travel[k];
            }
        }
        return distance;
    }


}