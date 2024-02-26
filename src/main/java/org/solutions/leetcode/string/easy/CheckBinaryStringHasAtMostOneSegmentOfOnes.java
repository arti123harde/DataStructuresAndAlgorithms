package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class CheckBinaryStringHasAtMostOneSegmentOfOnes {

    public static void main(String[] args) {
        System.out.println(checkOnesSegment("111111"));
        System.out.println(checkOnesSegment("1001"));
        System.out.println(checkOnesSegment("110"));
        System.out.println(checkOnesSegment("1"));
        System.out.println(checkOnesSegment("10"));
    }

    public static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
    public static boolean checkOnesSegment2(String s) {
        int index = s.indexOf('0');
        if(index == -1){
            return true;
        }else {
            return !s.substring(index + 1).contains("1");
        }
    }

    public static boolean checkOnesSegment1(String s) {
        int index = 0;
        while (index<s.length() && s.charAt(index) == '1'){
            index++;
        }
        return !s.substring(index).contains("1");
    }
}