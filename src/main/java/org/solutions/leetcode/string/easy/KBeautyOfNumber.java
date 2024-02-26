package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class KBeautyOfNumber {

    public static void main(String[] args) {
        System.out.println(divisorSubstrings(240, 2));
        System.out.println(divisorSubstrings(430043, 2));
    }

    public static int divisorSubstrings(int num, int k) {
        int count = 0;
        String s = String.valueOf(num);
        for(int i=0; i<s.length()-k+1; i++){
            int divider = Integer.parseInt(s.substring(i, i+k));
            if(divider!=0 && num % divider == 0){
                count++;
            }
        }
        return count;
    }
}