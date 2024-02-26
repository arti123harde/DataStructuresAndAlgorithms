package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class RepeatedSubstringPattern {

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abab"));
        System.out.println(repeatedSubstringPattern("aba"));
        System.out.println(repeatedSubstringPattern("abcabcabcabc"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        boolean result = false;
        for(int i=0; i<s.length(); i++){
            String temp = s.substring(0, i+1);
            if ((s.length() % temp.length() == 0) && (s.length() / temp.length() != 1)
                    && (s.equals(temp.repeat(s.length() / temp.length())))) {
                result = true;
                break;
            }
        }
        return result;
    }
}