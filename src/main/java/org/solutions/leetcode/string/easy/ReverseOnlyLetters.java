package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ReverseOnlyLetters {

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String s) {
        char[] chars = new char[s.length()];
        int i = 0;
        int j = s.length()-1;
        while (i<=j){
            boolean isIChar = isLetter(s.charAt(i));
            boolean isJChar = isLetter(s.charAt(j));
            if(!isIChar){
                chars[i] = s.charAt(i);
                i++;
            }
            if(!isJChar){
                chars[j] = s.charAt(j);
                j--;
            }
            if(isIChar && isJChar){
                chars[i] = s.charAt(j);
                chars[j] = s.charAt(i);
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    public static boolean isLetter(char c){
        return (64 < c && c < 91) ||  (96 < c && c < 123);
    }
}