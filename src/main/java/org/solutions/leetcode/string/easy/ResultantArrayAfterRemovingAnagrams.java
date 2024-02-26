package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class ResultantArrayAfterRemovingAnagrams {

    public static void main(String[] args) {
        System.out.println(removeAnagrams(new String[]{"yjonq","yqnoj","oyqjn","nqoyj","onjqy","joqyn","qynjo","jynoq"}));
        System.out.println(removeAnagrams(new String[]{"abba","baba","bbaa","cd","cd"}));
        System.out.println(removeAnagrams(new String[]{"a","b","c","d","e"}));
    }

    public static List<String> removeAnagrams(String[] words) {
        boolean isAnagram = true;
        List<String> list = new ArrayList<>(List.of(words));
        Map<String, int[]> map = new HashMap<>();
        for (String word : words) {
            int[] array = new int[26];
            for (char c : word.toCharArray()) {
                array[c - 'a'] = array[c - 'a'] + 1;
            }
            map.putIfAbsent(word, array);
        }
        while(isAnagram && list.size() > 1){
            for(int i=1; i<list.size(); i++){
                isAnagram = Arrays.equals(map.get(list.get(i-1)), map.get(list.get(i)));
                if(isAnagram){
                    list.remove(i);
                    break;
                }
            }
        }
        return list;
    }

}