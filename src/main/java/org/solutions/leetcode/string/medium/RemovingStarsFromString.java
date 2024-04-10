package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class RemovingStarsFromString {

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
        System.out.println(removeStars("erase*****"));
    }

    public static String removeStars(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '*'){
                stringBuilder.replace(stringBuilder.length()-1, stringBuilder.length(), "");
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static String removeStars1(String s) {
        while (s.contains("*")){
            int i = s.indexOf("*");
            s = s.substring(0, i-1) + s.substring(i+1);
        }
        return s;
    }
}