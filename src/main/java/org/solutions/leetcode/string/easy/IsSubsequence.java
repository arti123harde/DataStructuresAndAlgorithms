package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("ab", "baab"));
    }

    public static boolean isSubsequence(String s, String t) {
        for(char c : s.toCharArray()){
            int currIndex = t.indexOf(c);
            if(currIndex != -1){
                t = t.substring(currIndex+1);
            }else {
                return false;
            }
        }
        return true;
    }

}