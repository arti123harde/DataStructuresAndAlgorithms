package org.solutions.string;

import java.util.HashMap;
import java.util.Map;

public class WordsFormedByCharacters {

    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"cat","bt","hat","tree"}, "atach"));
        System.out.println(countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
    }

    public static int countCharacters(String[] words, String chars) {
        int count = 0;
        Map<Character, Integer> characterCountMap = new HashMap<>();
        for(char c : chars.toCharArray()){
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }
        for (String word : words) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : word.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            boolean temp = false;
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(characterCountMap.containsKey(entry.getKey()) && entry.getValue() <= characterCountMap.get(entry.getKey())){
                    temp = true;
                }else{
                    temp = false;
                    break;
                }
            }
            if(temp){
                count = count + word.length();
            }
        }
        return count;
    }

    public int countCharacters1(String[] words, String chars) {
        int count = 0;
        for (String word : words) {
            int temp = 0;
            for (char c : word.toCharArray()) {
                if (chars.indexOf(c) != -1) {
                    temp++;
                }
            }
            if (temp == word.length()) {
                count = count + word.length();
            }
        }
        return count;
    }
}
