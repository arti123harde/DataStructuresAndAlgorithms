package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class LargestOddNumber {

    public static void main(String[] args) {
        System.out.println(largestOddNumber("7"));
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));
    }

    public static String largestOddNumber(String num) {
        for(int i=num.length()-1; i>=0; i--){
            if(num.charAt(i) % 2 != 0){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}