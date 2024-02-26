package org.solutions.leetcode.string.easy;

public class SubstringsThreeDistinctCharacters {

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
        System.out.println(countGoodSubstrings("aababcabc"));
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for(int i=0; i<s.length()-2; i++){
            if((s.charAt(i) != s.charAt(1+i)) &&  (s.charAt(i+1) != s.charAt(i+2)) && (s.charAt(i) != s.charAt(i+2))){
                count++;
            }
        }
        return count;
    }
}
