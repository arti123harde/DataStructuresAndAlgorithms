package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class OutputContestMatches {

    public static void main(String[] args) {
        System.out.println(findContestMatch(4));
        System.out.println(findContestMatch(8));
    }

    public static String findContestMatch(int n) {
        String[] pairs = new String[n];
        for(int i=0; i<n; i++){
            pairs[i] = String.valueOf(i+1);
        }
        while (n > 1){
            for(int i=0,j=n-1; i<j; i++,j--){
                pairs[i] = new StringBuilder("(").append(pairs[i])
                        .append(",").append(pairs[j]).append(")").toString();
            }
            n = n/2;
        }
        return pairs[0];
    }

}