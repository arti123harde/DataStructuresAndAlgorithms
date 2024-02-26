package org.solutions.leetcode.string.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WildCardMatching {

    public static void main(String[] args) {
//        System.out.println(isMatch("cab", "?a" ));
//        System.out.println(isMatch("cbsdsds", "?bsdsds" ));
//        System.out.println(isMatch("sduhfjndjgndgfdjgkfdgdfg", "???hfjndjg?dgfdj??fdgdfg" ));
//        System.out.println(isMatch("aaesdfghjk", "*" ));
        System.out.println(isMatch("aa", "a*" ));
        System.out.println(isMatch("ab", "?*" ));
        System.out.println(isMatch("abcdefgh", "?bcd*h" ));
//        System.out.println(isMatch("adceb", "*a*b" ));
    }

    public static boolean isMatch(String s, String p){
        boolean result = false;
        int i=0;
        int j=0;
        while (i < s.length()){
            if(p.charAt(j) == '?'){
                j++;
                i++;
                result = true;
            }else if(p.charAt(j) == '*'){
                i++;
                result = true;
            }
        }
        return result;
    }

    private static boolean isMatch1(String s, String p){
        boolean result = false;
        if(s.equals(p)){
            result = true;
        }else if(p.startsWith("?")){
            result = checkForSingleCharacter(s, p);
        }else if(p.startsWith("*")) {
            result = checkForCharSequence(s, p);
        }else{
            int index = 0;
            while ((index < p.length()) && (p.charAt(index) != '?' && p.charAt(index) != '*')){
                index++;
            }
            if(index < p.length()){
                if(s.startsWith(p.substring(0, index))){
                    if(p.charAt(index) == '?'){
                        result = checkForSingleCharacter(s, p);
                    }else if(p.charAt(index) == '*'){
                        result = checkForCharSequence(s, p);
                    }
                }
            }
        }
        return result;
    }

    private static boolean checkForSingleCharacter(String s, String p){
        if(s.length() != p.length()){
            return false;
        }
        p = p.replaceAll("\\?", "");
        return  checkCharSequence(s, p);
    }

    private static boolean checkForCharSequence(String s, String p){
        p = p.replaceAll("\\*", "");
        return checkCharSequence(s, p);
    }

    private static boolean checkCharSequence(String s, String p){
        if(p.length()==0) {
            return true;
        }
        if(s.length() == 0) {
            return false;
        }
        if(s.charAt(0) == p.charAt(0)){
            return checkCharSequence(s.substring(1), p.substring(1));
        } else {
            return checkCharSequence(s.substring(1), p);
        }
    }
}
