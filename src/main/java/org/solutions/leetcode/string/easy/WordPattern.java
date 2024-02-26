package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Arti Harde
 */
public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] strs = s.split(" ");
        if(strs.length != pattern.length()){
            return false;
        }
        for(int i=0; i<pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
               if(map.containsValue(strs[i])){
                   return false;
               }else{
                   map.put(pattern.charAt(i), strs[i]);
               }
            }else if(!Objects.equals(map.get(pattern.charAt(i)), strs[i])){
                return false;
            }
        }
        return true;
    }
}