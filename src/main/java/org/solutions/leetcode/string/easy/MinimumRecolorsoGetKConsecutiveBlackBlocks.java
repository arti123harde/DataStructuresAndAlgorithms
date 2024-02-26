package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class MinimumRecolorsoGetKConsecutiveBlackBlocks {

    public static void main(String[] args) {
        System.out.println(minimumRecolors("BWWWBB", 6));
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
        System.out.println(minimumRecolors("WBWBBBW", 2));
    }

    public static int minimumRecolors(String blocks, int k) {
        int count = Integer.MAX_VALUE;
        for(int i=0; i<blocks.length()-k+1; i++){
            int temp = 0;
            for(char c : blocks.substring(i, i+k).toCharArray()){
                if(c == 'W'){
                    temp++;
                }
            }
            if(temp < count){
                count = temp;
            }
        }
        return count;
    }
}