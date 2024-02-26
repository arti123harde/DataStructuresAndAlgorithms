package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class LongestNiceSubstring {

    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("cChH"));
        System.out.println(longestNiceSubstring("YazaAay"));
        System.out.println(longestNiceSubstring("Bb"));
        System.out.println(longestNiceSubstring("c"));
    }

    public static String longestNiceSubstring(String s) {
        int max = 0;
        String maxString = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                String temp = isNiceString(s.substring(i,j+1));
                if(temp.length() > max){
                    max = temp.length();
                    maxString = temp;
                }
            }
        }
        return maxString;
    }

    private static String isNiceString(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(Character.isUpperCase(entry.getKey()) && !map.containsKey(Character.toLowerCase(entry.getKey()))){
                return "";
            }else if(Character.isLowerCase(entry.getKey()) && !map.containsKey(Character.toUpperCase(entry.getKey()))){
                return "";
            }
        }
        return s;
    }

    public static String longestNiceSubstring1(String s) {
        int max = 0;
        String maxString = "";
        int beginIndex = 0;
        int endIndex = 0;
        int count = 0;
        boolean isUppercase = false;
        boolean isLowercase = false;
        for(int i=0; i<s.length()-1; i++){
            int diff = Math.abs(s.charAt(i) - s.charAt(i+1));
            if(diff == 0 || diff == 32){
                if(96 < s.charAt(i) && s.charAt(i) < 123 || 96 < s.charAt(i+1) && s.charAt(i+1) < 123){
                    isLowercase = true;
                }
                if(64 < s.charAt(i) && s.charAt(i) < 91 || 64 < s.charAt(i+1) && s.charAt(i+1) < 91){
                    isUppercase = true;
                }
                count++;
                endIndex = i+1;
                if(max < count && isUppercase && isLowercase){
                    max = count;
                    maxString = s.substring(beginIndex, endIndex+1);
                }
            }else {
                count = 0;
                beginIndex = i+1;
                isUppercase = false;
                isLowercase = false;
            }

        }
        return maxString;
    }

}