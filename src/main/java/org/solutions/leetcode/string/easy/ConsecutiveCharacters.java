package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ConsecutiveCharacters {

    public static void main(String[] args) {
        System.out.println(maxPower("cc"));
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }

    public static int maxPower(String s) {
        int maxLength = 0;
        int count = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                count = 0;
            }
            maxLength = Math.max(count, maxLength);
        }
        return Math.max(count, maxLength) + 1;
    }
}