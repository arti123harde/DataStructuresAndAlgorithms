package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class FindAndReplacePattern {

    public static void main(String[] args) {
        System.out.println(findAndReplacePattern(new String[]{"abc","deq","mee","aqq","dkd","ccc"},
                "abb"));
        System.out.println(findAndReplacePattern(new String[]{"a","b","c"},
                "a"));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        Map<Character, List<Integer>> map = new LinkedHashMap<>();
        for (int i=0; i<pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i), new ArrayList<>());
            }
            map.get(pattern.charAt(i)).add(i);
        }
        for (String s : words) {
            Map<Character, List<Integer>> map1 = new LinkedHashMap<>();
            for (int i=0; i<s.length(); i++) {
                if(!map1.containsKey(s.charAt(i))){
                    map1.put(s.charAt(i), new ArrayList<>());
                }
                map1.get(s.charAt(i)).add(i);
            }
            boolean isValid = true;
            for(List<Integer> list : map.values()){
                if(!map1.containsValue(list)){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                result.add(s);
            }
        }
        return result;
    }
}