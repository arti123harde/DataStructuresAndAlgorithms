package org.solutions.leetcode.string.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

    public static void main(String[] args) {
        System.out.println(minSteps("bab", "aba"));
        System.out.println(minSteps("leetcode", "practice"));
        System.out.println(minSteps("anagram", "mangaar"));
    }

    public static int minSteps1(String s, String t) {
        int count = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0) + 1);
        }
        for(char c : map1.keySet()){
            if(map1.get(c) > map2.getOrDefault(c, 0)){
                count = count + map1.get(c) - map2.getOrDefault(c, 0);
            }
        }
        return count;
    }

    public static int minSteps(String s, String t) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        int[] sc = new int[26];
        int[] tc = new int[26];
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
            sc[s.charAt(i) - 'a']++;
            tc[t.charAt(i) - 'a']++;
        }
        for(char c : set){
            int i2 = sc[c - 'a'];
            int i3 = tc[c - 'a'];
            if(i2 > i3){
                count = count + i2 - i3;
            }
        }
        return count;
    }
}