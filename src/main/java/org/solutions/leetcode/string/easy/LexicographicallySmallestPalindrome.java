package org.solutions.leetcode.string.easy;

public class LexicographicallySmallestPalindrome {

    public static void main(String[] args) {
        System.out.println(makeSmallestPalindrome1("egcfe"));
        System.out.println(makeSmallestPalindrome("abcd"));
        System.out.println(makeSmallestPalindrome("seven"));
    }

    public static String makeSmallestPalindrome(String s) {
        String[] str = new String[s.length()];
        for(int i=0,j=s.length()-1; i<=j; i++,j--){
            if(s.charAt(i) < s.charAt(j)){
                str[i] = str[j] = String.valueOf(s.charAt(i));
            }else{
                str[i] = str[j] = String.valueOf(s.charAt(j));
            }
        }
        return String.join("", str);
    }

    public static String makeSmallestPalindrome1(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            sb.append(Character.toString(Math.min(s.charAt(i), s.charAt(s.length() - i - 1))));
        }
        return sb.toString();
    }

}
