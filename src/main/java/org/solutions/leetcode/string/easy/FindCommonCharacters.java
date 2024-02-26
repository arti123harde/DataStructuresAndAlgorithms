package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {

    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"bella","label","roller"}));
        System.out.println(commonChars(new String[]{"cool","lock","cook"}));
        System.out.println(commonChars(new String[]{"bbddabab","cbcddbdd","bbcadcab","dabcacad","cddcacbc","ccbdbcba","cbddaccc","accdcdbb"}));
        System.out.println(commonChars(new String[]{"dadaabaa","bdaaabcc","abccddbb","bbaacdba","ababbbab","ccddbbba","bbdabbda","bdabaacb"}));
    }

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : words[0].toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            boolean temp = true;
            for(int i=1; i<words.length; i++){
                int c = (int)words[i].chars().filter(c1 -> c1 == entry.getKey()).count();
                if(c != 0){
                    count = count == 0 ? c : Math.min(count, c);
                }else{
                    temp = false;
                    break;
                }
            }
            if(temp){
                for(int j=0; j<count; j++){
                    result.add(String.valueOf(entry.getKey()));
                }
            }
        }
        return result;
    }
}
