package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class EquivalentStrings {

    public static void main(String[] args) {
        System.out.println(checkAlmostEquivalent("zzzyyy", "iiiiii"));
        System.out.println(checkAlmostEquivalent("aaaa", "aaaa"));
        System.out.println(checkAlmostEquivalent("aaaa", "bccb"));
        System.out.println(checkAlmostEquivalent("abcdeef", "abaaacc"));
        System.out.println(checkAlmostEquivalent("cccddabba", "babababab"));
    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<word1.length(); i++){
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0)+1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0)+1);
        }
        return evaluateMaps(map1, map2) && evaluateMaps(map2, map1);
    }

    private static boolean evaluateMaps(Map<Character, Integer> map1, Map<Character, Integer> map2){
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            if((map2.containsKey(entry.getKey()) && Math.abs(map2.get(entry.getKey()) - entry.getValue()) > 3)){
                return false;
            }else if(!map2.containsKey(entry.getKey()) && entry.getValue() > 3){
                return false;
            }
        }
        return true;
    }
}