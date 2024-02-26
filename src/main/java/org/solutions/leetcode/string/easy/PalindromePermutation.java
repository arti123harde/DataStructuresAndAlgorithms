package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class PalindromePermutation {

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("code"));
        System.out.println(canPermutePalindrome("aab"));
        System.out.println(canPermutePalindrome("carerac"));
    }

    public static boolean canPermutePalindrome(String s) {
        boolean result = false;
        Map<Character, Integer> map = new HashMap<>();
        boolean mod1Exists = false;
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int count : map.values()){
            int mod = count % 2;
            if(mod == 1 && !mod1Exists){
                mod1Exists = true;
                result = true;
            }else if(mod == 0){
                result = true;
            }else {
                result = false;
                break;
            }
        }
        return result;
    }

}