package org.solutions.leetcode.string.easy;

import java.lang.module.FindException;

/**
 * @author Arti Harde
 */
public class CountBinarySubstrings {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
        System.out.println(countBinarySubstrings("10101"));
    }

    public static int countBinarySubstrings(String s) {
        int[] count = {0};
        int i = 0;
        while(i<s.length()){
            char c = s.charAt(i);
            i = (c == '0' ? countSubstrings('0', '1', i, s, count) : countSubstrings('1', '0', i, s, count));
        }
        return count[0];
    }

    private static int countSubstrings(char c1, char c2, int index, String s, int[] count){
        int m = 0;
        int n = 0;
        char c = c1;
        while(c == c1){
            m++;
            index++;
            if(index < s.length()){
                c = s.charAt(index);
            }else{
                break;
            }
        }
        while(c == c2 && index < s.length()){
            n++;
            index++;
            if(index < s.length()){
                c = s.charAt(index);
            }else{
                break;
            }
        }
        if(n >= m){
            count[0] = count[0] + m;
        }else if(n < m){
            count[0] = count[0] + n;
        }
        return index-n;
    }

}