package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class CheckIfStringsCanBeMadeEqualWithOperationsI {

    public static void main(String[] args) {
        System.out.println(canBeEqual("abcd", "cdab"));
        System.out.println(canBeEqual("abcd", "dacb"));
    }

    public static boolean canBeEqual(String s1, String s2) {
        char[] chars = new char[4];
        if(s1.charAt(0) != s2.charAt(0) && s1.charAt(2) == s2.charAt(0) && s1.charAt(2) != s2.charAt(2) && s1.charAt(2) == s2.charAt(0)){
            chars[0] = s1.charAt(2);
            chars[2] = s1.charAt(0);
        }else {
            chars[0] = s1.charAt(0);
            chars[2] = s1.charAt(2);
        }
        if(s1.charAt(1) != s2.charAt(1) && s1.charAt(3) == s2.charAt(1) && s1.charAt(3) != s2.charAt(3) && s1.charAt(3) == s2.charAt(1)){
            chars[1] = s1.charAt(3);
            chars[3] = s1.charAt(1);
        }else {
            chars[1] = s1.charAt(1);
            chars[3] = s1.charAt(3);
        }
        return s2.equals(new String(chars));
    }
}