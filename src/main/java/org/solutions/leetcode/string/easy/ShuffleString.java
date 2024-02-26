package org.solutions.leetcode.string.easy;

public class ShuffleString {

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
        System.out.println(restoreString("abc", new int[]{0,1,2}));
    }

    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        for(int i=0; i<indices.length; i++){
            chars[indices[i]] = s.charAt(i);
        }
        return String.valueOf(chars);
    }
}
