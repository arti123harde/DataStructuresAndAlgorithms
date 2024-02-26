package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class MinimumNumberPushesToTypeWord1 {

    public static void main(String[] args) {
        System.out.println(minimumPushes("abcde"));
        System.out.println(minimumPushes("xycdefghij"));
    }

    public static int minimumPushes(String word) {
        if(word.length() <= 8){
            return word.length();
        }else{
            int iteration = 1;
            int len = word.length();
            int count = 0;
            while (len > 0){
                if(len >= 8){
                    count = count + 8 * iteration;
                    len = len - 8;
                }else{
                    count = count + len * iteration;
                    len = 0;
                }
                iteration++;
            }
            return count;
        }
    }
}