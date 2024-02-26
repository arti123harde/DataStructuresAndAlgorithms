package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ValidPalindromeI {

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));
        System.out.println(validPalindrome("abc"));
    }

    public static boolean validPalindrome(String s) {
        if(s.length() == 1 || s.length() == 2){
            return true;
        }else {
            int begin = 0;
            int end = s.length() - 1;
            while (begin < end){
                if(s.charAt(begin) != s.charAt(end)){
                    return new StringBuilder(s.substring(begin + 1, end + 1)).reverse().toString().equals(s.substring(begin + 1, end + 1))
                            || new StringBuilder(s.substring(begin, end)).reverse().toString().equals(s.substring(begin, end));
                }
                begin++;
                end--;
            }
            return true;
        }
    }


    //Exceeds time limit
    public static boolean validPalindrome1(String s) {
        if(s.length() == 1 || s.length() == 2){
            return true;
        }else {
            String s1;
            for(int i=0; i<s.length(); i++){
                if(i==0){
                    s1 = s.substring(1);
                }else {
                    s1 = s.substring(0, i) + s.substring(i+1);
                }
                if(new StringBuilder(s1).reverse().toString().equals(s1)){
                    return true;
                }
            }
        }
        return false;
    }
}