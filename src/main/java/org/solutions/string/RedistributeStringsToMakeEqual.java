package org.solutions.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RedistributeStringsToMakeEqual {

    public static void main(String[] args) {
        System.out.println(makeEqual(new String[]{"abc","aabc","bc"}));
        System.out.println(makeEqual(new String[]{"ab","a"}));
        System.out.println(makeEqual(new String[]{"a","b"}));
        System.out.println(makeEqual(new String[]{"aabbccdde","e"}));
    }

    public static boolean makeEqual(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for(String s : words){
            for(char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() % words.length != 0){
                return false;
            }
        }
        return true;
    }

    public static boolean makeEqual1(String[] words) {
        int count = 0;
        for(String w : words){
            count = count + w.length();
        }
        if(count % words.length != 0){
            return false;
        }
        int wordLength = count / words.length;
        String equalWord = "";
        List<String> extraCharacters = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            if(words[i].length() == wordLength){
                equalWord = words[i];
            }else if(words[i].length() > wordLength){
                extraCharacters.add(words[i].replace(equalWord, ""));
                words[i] = equalWord;
            }
        }
        for(int i=0; i<words.length; i++){
            if(words[i].length() == wordLength){
                equalWord = words[i];
            }if(words[i].length() < wordLength){
                String temp = equalWord;
                String s = equalWord.replace(words[i], "");
                words[i] = s + words[i];
                extraCharacters.remove(s);
                equalWord = temp;
            }
        }
        List<Character> l1 = equalWord.chars().mapToObj(c1 -> (char)c1).sorted().collect(Collectors.toList());
        for (String word : words) {
            List<Character> l2 = word.chars().mapToObj(c1 -> (char) c1).sorted().collect(Collectors.toList());
            if (!l1.equals(l2)) {
                return false;
            }
        }
        return extraCharacters.isEmpty();
    }
}
