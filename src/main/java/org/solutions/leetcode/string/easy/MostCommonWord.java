package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class MostCommonWord {

    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"}));
        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",
                new String[]{"hit"}));
        System.out.println(mostCommonWord("a.", new String[]{}));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        int max = Integer.MIN_VALUE;
        Set<String> stringSet = new HashSet<>(List.of(banned));
        StringBuilder s = new StringBuilder();
        paragraph = paragraph.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<paragraph.length(); i++){
            boolean isLetter = Character.isLetter(paragraph.charAt(i));
            if(isLetter){
                s.append(paragraph.charAt(i));
            }
            if(!isLetter || i+1 == paragraph.length()){
                String finalS = s.toString();
                if(!finalS.equals("") && !stringSet.contains(finalS)){
                    map.put(s.toString(), map.getOrDefault(s.toString(), 0) + 1);
                }
                s = new StringBuilder();
            }
        }
        s = new StringBuilder();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
                s = new StringBuilder(entry.getKey());
            }
        }
        return s.toString();
    }
}