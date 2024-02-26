package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class RotateString {

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String s, String goal) {
        int count = 0;
        while (count<s.length()){
            count++;
            s = s.substring(1) + s.charAt(0);
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}