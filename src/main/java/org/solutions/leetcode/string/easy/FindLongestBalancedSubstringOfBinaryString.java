package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class FindLongestBalancedSubstringOfBinaryString {

    public static void main(String[] args) {
        System.out.println(findTheLongestBalancedSubstring("01000111"));
        System.out.println(findTheLongestBalancedSubstring("01000111"));
        System.out.println(findTheLongestBalancedSubstring("00111"));
        System.out.println(findTheLongestBalancedSubstring("111"));
        System.out.println(findTheLongestBalancedSubstring("001"));
    }

    public static int findTheLongestBalancedSubstring(String s) {
        int index  = 0;
        int maxLength = Integer.MIN_VALUE;
        while (index < s.length()){
            if(s.charAt(index) == '0'){
                int i = s.indexOf('1', index);
                if(i != -1 && (i + (i - index)) <= s.length() && s.substring(i, i + (i - index)).equals("1".repeat(i - index))){
                    maxLength = Math.max(maxLength, (i - index) * 2);
                }
            }
            index++;
        }
        return maxLength == Integer.MIN_VALUE ? 0 : maxLength;
    }

    public static int findTheLongestBalancedSubstring1(String s) {
        int index  = 0;
        String temp = s;
        int maxLength = Integer.MIN_VALUE;
        while (index < s.length()){
            int i = temp.indexOf('0', index);
            if(i != -1){
                int j = temp.indexOf('1', i);
                if(j != -1 && j > i && temp.substring(j, 2 * j - i).equals("1".repeat(j - i))){
                    maxLength = Math.max(maxLength, (j - i) * 2);
                    index = index + 2 * j - i + 1;
                    temp = s.substring(index);
                }else {
                    index++;
                }
            }else {
                index++;
            }
        }
        return maxLength == Integer.MIN_VALUE ? 0 : maxLength;
    }
}