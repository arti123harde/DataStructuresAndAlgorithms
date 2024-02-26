package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class MaximumScoreAfterSplittingString {

    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
        System.out.println(maxScore("00111"));
        System.out.println(maxScore("1111"));
        System.out.println(maxScore("01"));
        System.out.println(maxScore("10"));
    }

    public static int maxScore(String s) {
        int i = 0;
        int j = 1;
        int max = 0;
        while (i<s.length()-1 && j>=1){
            int score = (int)s.substring(0, i+1).chars().filter(c -> c=='0').count() + (int)s.substring(j).chars().filter(c -> c=='1').count();
            if(max < score){
                max = score;
            }
            i++;
            j++;
        }
        return max;
    }
}