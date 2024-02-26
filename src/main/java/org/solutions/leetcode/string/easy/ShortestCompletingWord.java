package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class ShortestCompletingWord {

    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 PSt", new String[]{"step","steps","stripe","stepple"}));
        System.out.println(shortestCompletingWord("1s3 456", new String[]{"looks","pest","stew","show"}));
        System.out.println(shortestCompletingWord("GrC8950",
                new String[]{"measure","other","every","base","according","level","meeting","none","marriage","rest"}));

    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String smallestWord = "";
        Map<Character, Integer> map = new HashMap<>();
        for(char c : licensePlate.toCharArray()){
           if(Character.isLetter(c)){
               map.put(Character.toLowerCase(c), map.getOrDefault(Character.toLowerCase(c), 0) + 1);
           }
        }
        for(String word : words){
            Map<Character, Integer> map1 = new HashMap<>();
            boolean containsAll = true;
            for(char c: word.toCharArray()){
                map1.put(Character.toLowerCase(c), map1.getOrDefault(Character.toLowerCase(c), 0) + 1);
            }
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(!map1.containsKey(entry.getKey()) || map1.get(entry.getKey()) < entry.getValue()){
                    containsAll = false;
                    break;
                }
            }
            if(containsAll && (smallestWord.equals("") || smallestWord.length() > word.length())){
                smallestWord = word;
            }
        }
        return smallestWord;
    }
}