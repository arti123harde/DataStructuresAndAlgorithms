package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class MinimumMovesToConvertString {

    public static void main(String[] args) {
        System.out.println(minimumMoves("OXOX"));
        System.out.println(minimumMoves("XXX"));
        System.out.println(minimumMoves("XXOX"));
        System.out.println(minimumMoves("OOOO"));
    }

    public static int minimumMoves(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(chars[i] == 'X'){
                chars[i] = 'O';
                if(i+1<s.length() && chars[i+1] == 'X'){
                    chars[i+1] = 'O';
                }
                if(i+2<s.length() && chars[i+2] == 'X'){
                    chars[i+2] = 'O';
                }
                count++;
            }
        }
        return count;
    }
}