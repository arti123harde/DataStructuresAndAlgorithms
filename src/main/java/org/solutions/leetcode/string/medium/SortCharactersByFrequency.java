package org.solutions.leetcode.string.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Arti Harde
 */
public class SortCharactersByFrequency {

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort("cccaaa"));
        System.out.println(frequencySort("Aabb"));
    }

    public static String frequencySort(String s) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(String.valueOf(s.charAt(i)), map.getOrDefault(String.valueOf(s.charAt(i)), 0) + 1);
        }
        Map<String, Integer> temp = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        StringBuilder stringBuilder = new StringBuilder();
        for(Map.Entry<String, Integer> entry : temp.entrySet()){
            stringBuilder.append(entry.getKey().repeat(entry.getValue()));
        }
        return stringBuilder.toString();
    }
}