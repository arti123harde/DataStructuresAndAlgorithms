package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class SlowestKey {

    public static void main(String[] args) {
        System.out.println(slowestKey(new int[]{9,29,49,50}, "cbcd"));
        System.out.println(slowestKey(new int[]{12,23,36,46,62}, "spuda"));
    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char slowestChar = keysPressed.charAt(0);
        for(int i=0; i<releaseTimes.length-1; i++){
            int diff = releaseTimes[i+1] - releaseTimes[i];
            if(diff > max || (diff == max && slowestChar < keysPressed.charAt(i+1))){
                max = diff;
                slowestChar = keysPressed.charAt(i+1);
            }
        }
        return slowestChar;
    }
}