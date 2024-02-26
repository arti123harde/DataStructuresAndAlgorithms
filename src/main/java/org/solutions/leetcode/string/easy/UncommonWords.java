package org.solutions.leetcode.string.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class UncommonWords {

    public static void main(String[] args) {
        PrintUtil.printArray(uncommonFromSentences("this apple is sweet", "this apple is sour"));
        PrintUtil.printArray(uncommonFromSentences("apple apple", "banana"));
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> split1 = Arrays.asList(s1.split(" "));
        List<String> split2 = Arrays.asList(s2.split(" "));
        for(String word : split1){
            if(!split2.contains(word)){
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        for(String word : split2){
            if(!split1.contains(word)){
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        return map.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue() == 1)
                .map(Map.Entry::getKey).toArray(String[]::new);

    }

}