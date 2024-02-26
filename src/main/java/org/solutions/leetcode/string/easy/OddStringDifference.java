package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * @author Arti Harde
 */
public class OddStringDifference {

    public static void main(String[] args) {
        System.out.println(oddString(new String[]{"abm","bcn","alm"}));
        System.out.println(oddString(new String[]{"adc","wzy","abc"}));
        System.out.println(oddString(new String[]{"aaa","bob","ccc","ddd"}));
    }

    public static String oddString(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        String[] diff = new String[words.length];
        for(int k=0; k< words.length; k++){
            StringBuilder s = new StringBuilder();
            for(int i=0; i<words[k].length()-1; i++){
                s.append(words[k].charAt(i + 1) - words[k].charAt(i)).append(",");
            }
            diff[k] = s.toString();
            map.put(diff[k], map.getOrDefault(diff[k], 0) + 1);
        }
        Optional<Map.Entry<String, Integer>> entry1 = map.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();
        if(entry1.isPresent()){
            for (int i=0; i< diff.length; i++){
                if(Objects.equals(entry1.get().getKey(), diff[i])){
                    return words[i];
                }
            }
        }
        return "";
    }
}