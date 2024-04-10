package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class MinimumSuffixFlips {

    public static void main(String[] args) {
        System.out.println(minFlips("10111"));
        System.out.println(minFlips("101"));
        System.out.println(minFlips("00000"));
    }

    public static int minFlips(String target) {
        int flips  = 0;
        char c = '0';
        for(int i=0; i<target.length(); i++){
            if(target.charAt(i) == '1' && target.charAt(i) != c){
                c = '1';
                flips++;
            }else if(target.charAt(i) == '0' && target.charAt(i) != c){
                c = '0';
                flips++;
            }
        }
        return flips;
    }

}