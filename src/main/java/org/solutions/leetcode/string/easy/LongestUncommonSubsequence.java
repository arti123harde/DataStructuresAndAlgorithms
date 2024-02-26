package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class LongestUncommonSubsequence {

    public static void main(String[] args) {
        System.out.println(findLUSlength("aba", "cdc"));
        System.out.println(findLUSlength("aaa", "bbb"));
        System.out.println(findLUSlength("aaa", "aaa"));
    }

    public static int findLUSlength(String a, String b) {
        int length1 = -1;
        int length2 = -1;
        for(int i=0; i<a.length(); i++){
            for(int j=i; j<a.length(); j++){
                String string = a.substring(i, j+1);
                if(!b.contains(a.substring(i,j)) && length1 < string.length()){
                    length1 = string.length();
                }
            }
        }
        for(int i=0; i<b.length(); i++){
            for(int j=i; j<b.length(); j++){
                String string = b.substring(i, j+1);
                if(!a.contains(b.substring(i,j)) && length2 < string.length()){
                    length2 = string.length();
                }
            }
        }
        return Math.max(length1, length2);
    }
}