package org.solutions.leetcode.string.easy;

public class FaultyKeyboard {

    public static void main(String[] args) {
        System.out.println(finalString("string"));
        System.out.println(finalString("poiinter"));
    }

    public static String finalString(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c != 'i'){
                stringBuilder.append(c);
            }else {
                stringBuilder.reverse();
            }
        }
        return stringBuilder.toString();
    }
}
