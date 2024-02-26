package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class MakeThreeStringsEqual {

    public static void main(String[] args) {
        System.out.println(findMinimumOperations("oby", "obz", "obf"));
        System.out.println(findMinimumOperations("abc", "abb", "ab"));
        System.out.println(findMinimumOperations("dac", "bac", "cac"));
    }

    public static int findMinimumOperations(String s1, String s2, String s3) {
        int maxLength = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        int index = 0;
        for (int i=0; i < maxLength; i++){
            if(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)){
                index++;
            }else {
                break;
            }
        }
        if(index == 0){
            return -1;
        }else {
            return s1.length() + s2.length() + s3.length() - (3 * index);
        }
    }
}