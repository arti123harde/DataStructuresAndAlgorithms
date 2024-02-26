package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Arti Harde
 */
public class ValidAnagrams {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0)+1);
        }
        return map1.size() > map2.size() ? match(map1, map2) : match(map2, map1);
    }

    public static boolean match(Map<Character, Integer> map1, Map<Character, Integer> map2){
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            if(!Objects.equals(entry.getValue(), map2.get(entry.getKey()))){
                return false;
            }
        }
        return true;
    }
}