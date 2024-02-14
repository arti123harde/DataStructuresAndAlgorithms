package org.solutions.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommonWordWithOneOccurance {

    public static void main(String[] args) {
        System.out.println(countWords(new String[]{"leetcode","is","amazing","as","is"},new String[]{"amazing","leetcode","is"}));
        System.out.println(countWords(new String[]{"b","bb","bbb"},new String[]{"a","aa","aaa"}));
        System.out.println(countWords(new String[]{"a","ab"},new String[]{"a","a","a","ab"}));
    }

    public static int countWords(String[] words1, String[] words2) {
        int count = 0;
        Map<String, Long> count1 = Arrays.stream(words1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> count2 = Arrays.stream(words2).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for(Map.Entry<String, Long> entry : count1.entrySet()){
            if(entry.getValue() == 1 && count2.containsKey(entry.getKey()) && count2.get(entry.getKey()) == 1){
                count++;
            }
        }
        return count;
    }
}
