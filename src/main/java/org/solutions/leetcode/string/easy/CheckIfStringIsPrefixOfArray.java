package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class CheckIfStringIsPrefixOfArray {

    public static void main(String[] args) {
        System.out.println(isPrefixString("applebananacookie", new String[]{"apple","banana","cookie"}));
        System.out.println(isPrefixString("applebananacookie", new String[]{"banana","apple","cookie"}));
        System.out.println(isPrefixString("aaaaaaa", new String[]{"a","a","a","a","a","a","a","a"}));
        System.out.println(isPrefixString("ccccccccc", new String[]{"c","cc"}));
        System.out.println(isPrefixString("iloveleetcode", new String[]{"i","love","leetcode","apples"}));
        System.out.println(isPrefixString("iloveleetcode", new String[]{"apples","i","love","leetcode"}));
    }

    public static boolean isPrefixString(String s, String[] words) {
        for(String word : words){
            if(s.length()>0 && s.startsWith(word)){
                s = s.substring(word.length());
            }else if(s.length() == 0){
                return true;
            } else {
                return false;
            }
        }
        return s.length() == 0;
    }
}