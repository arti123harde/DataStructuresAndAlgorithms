package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class RearrangeCharactersToMakeTargetStrings {

    public static void main(String[] args) {
        System.out.println(rearrangeCharacters("lrnvlcqukanpdnluowenfxquitzryponxsikhciohyostvmkapkfpglzikitwiraqgchxnpryhwpuwpozacjhmwhjvslprqlnxrk",
                "woijih"));
        System.out.println(rearrangeCharacters("ilovecodingonleetcode", "code"));
        System.out.println(rearrangeCharacters("abcba", "abc"));
        System.out.println(rearrangeCharacters("abbaccaddaeea", "aaaaa"));
    }

    public static int rearrangeCharacters(String s, String target) {
        int count = Integer.MAX_VALUE;
        Map<Character, Integer> targetMap = new HashMap<>();
        for(int i = 0; i<target.length(); i++){
            targetMap.put(target.charAt(i), targetMap.getOrDefault(target.charAt(i), 0) + 1);
        }
        Map<Character, Integer> stringMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            stringMap.put(s.charAt(i), stringMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : targetMap.entrySet()){
            if(stringMap.containsKey(entry.getKey())){
                count = Math.min(count, stringMap.get(entry.getKey()) / entry.getValue());
            }else {
                count = 0;
                break;
            }
        }
        return count;
    }
}