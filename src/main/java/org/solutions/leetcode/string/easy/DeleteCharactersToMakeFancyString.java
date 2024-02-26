package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class DeleteCharactersToMakeFancyString {

    public static void main(String[] args) {
        System.out.println(makeFancyString("aaabaaaa"));
        System.out.println(makeFancyString("leeetcode"));
        System.out.println(makeFancyString("aab"));
        System.out.println(makeFancyString(""));
    }

    //My final Solution
    public static String makeFancyString(String s) {
        if(s.length() < 3){
            return s;
        }else{
            StringBuilder s1 = new StringBuilder(s.substring(0, 2));
            for(int i=2; i<s.length(); i++){
                if(s.charAt(i)!=s1.charAt(s1.length()-1) || s.charAt(i)!=s1.charAt(s1.length()-2)){
                    s1.append(s.charAt(i));
                }
            }
            return s1.toString();
        }
    }

    //Time is less than 10ms due to use of stringBuilder - this is nit my solution
    public static String makeFancyString2(String s) {
        StringBuilder s1 = new StringBuilder(String.valueOf(s.charAt(0)));
        char lastChar = s.charAt(0);
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == lastChar) {
                count++;
            } else {
                lastChar = s.charAt(i);
                count = 0;
            }
            if (count < 2) {
                s1.append(s.charAt(i));
            }
        }
        return s1.toString();
    }

    //Time is more than 310ms due to + operator for building string
    public static String makeFancyString1(String s) {
        String s1 = String.valueOf(s.charAt(0));
        char lastChar = s.charAt(0);
        int count = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == lastChar){
                count++;
            }else{
                lastChar = s.charAt(i);
                count = 0;
            }
            if(count < 2){
                s1 = s1 + s.charAt(i);
            }
        }
        return s1;
    }
}