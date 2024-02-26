package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 1));
        System.out.println(reverseStr("abcdefg", 2));
        System.out.println(reverseStr("abcd", 2));
        System.out.println(reverseStr("abcd", 3));
        System.out.println(reverseStr("abcd", 4));
    }

    public static String reverseStr(String s, int k) {
        int index = 0;
        while(index < s.length()){
            if(s.length() - index >= 2 * k){
                s = s.substring(0, index) + new StringBuilder(s.substring(index, index + k)).reverse() + s.substring(index + k);
                index = index + 2 * k;
            }
            if(s.length() - index < 2 * k && s.length() - index > k){
                s = s.substring(0, index) + new StringBuilder(s.substring(index, index + k)).reverse() + s.substring(index + k);
                break;
            }
            if(s.length() - index <= k){
                s = s.substring(0, index) + new StringBuilder(s.substring(index)).reverse();
                break;
            }
        }
        return s;
    }
}