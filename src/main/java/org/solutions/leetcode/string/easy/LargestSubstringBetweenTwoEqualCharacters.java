package org.solutions.leetcode.string.easy;

public class LargestSubstringBetweenTwoEqualCharacters {

    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("aa"));
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
        System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));
    }

    private static int maxLengthBetweenEqualCharacters(String s) {
        int diff = -1;
        for(int i=0; i<s.length(); i++){
            int lastIndex= s.lastIndexOf(s.charAt(i));
            if(lastIndex != -1){
                diff = Math.max(lastIndex - i - 1, diff);
            }
        }
        return diff;
    }
}
