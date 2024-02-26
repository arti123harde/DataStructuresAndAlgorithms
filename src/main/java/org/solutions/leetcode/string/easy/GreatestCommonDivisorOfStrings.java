package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(str1.charAt(0) != str2.charAt(0)){
            return "";
        }else {
            return str1.length() < str2.length() ? findGCD(str1, str2) : findGCD(str2, str1);
        }
    }

    private static String findGCD(String s1, String s2){
        String gcd = "";
        for(int i=0; i<s1.length(); i++){
            String g = s1.substring(0, i+1);
            if((s1.length() % g.length() == 0) && (s2.length() % g.length() == 0)){
                if(s1.equals(g.repeat(s1.length()/g.length())) && s2.equals(g.repeat(s2.length()/g.length()))){
                    if(gcd.length() < g.length()){
                        gcd = g;
                    }
                }
            }
        }
        return gcd;
    }
}