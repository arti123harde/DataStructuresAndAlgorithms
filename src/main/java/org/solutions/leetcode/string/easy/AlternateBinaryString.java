package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class AlternateBinaryString {

    public static void main(String[] args) {
        System.out.println(minOperations("0100"));
        System.out.println(minOperations("10"));
        System.out.println(minOperations("1111"));
        System.out.println(minOperations("10010100"));
    }

    public static int minOperations(String s) {
        return Math.min(checkNumOfOperations('0', '1', s), checkNumOfOperations('1', '0', s));
    }

    public static int checkNumOfOperations(char c1, char c2, String s){
        int count = 0;
        for(int i=0; i<s.length(); i=i+2){
            if(s.charAt(i) != c1){
                count++;
            }
            if(i+1<s.length() && s.charAt(i+1) != c2){
                count++;
            }
        }
        return count;
    }

}