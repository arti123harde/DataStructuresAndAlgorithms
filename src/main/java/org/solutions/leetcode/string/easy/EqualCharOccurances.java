package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EqualCharOccurances {

    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abacbc"));
        System.out.println(areOccurrencesEqual("aaabb"));
        System.out.println(areOccurrencesEqual("vvvvvvvvvvvvvvvvvvv"));
    }

    public static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!count.containsKey(s.charAt(i))){
                count.put(s.charAt(i), 0);
            }
            count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
        }
        return new HashSet<>(count.values()).size() == 1;
    }
}
