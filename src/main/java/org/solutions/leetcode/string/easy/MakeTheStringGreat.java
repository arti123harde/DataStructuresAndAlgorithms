package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class MakeTheStringGreat {

    public static void main(String[] args) {
        System.out.println(makeGood("s"));
        System.out.println(makeGood("leEeetcode"));
        System.out.println(makeGood("abBAcC"));
    }

    public static String makeGood(String s) {
        int index = 0;
        while (index < s.length()-1){
            if(Math.abs(s.charAt(index) -  s.charAt(index+1)) == 32){
                s = s.substring(0, index) + s.substring(index+2);
                index = 0;
            }else{
                index++;
            }
        }
        if(s.length() == 0){
            s = "";
        }
        return s;
    }
}