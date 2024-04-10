package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(makePalindrome("abcdba"));
        System.out.println(makePalindrome("aa"));
        System.out.println(makePalindrome("abcdef"));
    }

    public static boolean makePalindrome(String s) {
        int count = 0;
        for(int i=0,j=s.length()-1; i<=j; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                count++;
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }
}