package org.solutions.string;

public class FirstPalindromeStringInArray {

    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
        System.out.println(firstPalindrome(new String[]{"notapalindrome","racecar"}));
        System.out.println(firstPalindrome(new String[]{"def","ghi"}));
    }

    public static String firstPalindrome(String[] words) {
        String s = "";
        for (String word : words) {
            if (word.equals(new StringBuilder(word).reverse().toString())) {
                s = word;
                break;
            }
        }
        return s;
    }

}
