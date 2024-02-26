package org.solutions.leetcode.string.easy;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Arti Harde
 */
public class FirstUniqueCharacterInString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> characters = new LinkedHashMap<>();
        for (char c: s.toCharArray()){
            characters.put(c, characters.getOrDefault(c, 0) + 1);
        }
        Optional<Map.Entry<Character, Integer>> uniqueCharacter = characters.entrySet()
                .stream().filter(entry -> entry.getValue() == 1).findFirst();
        return uniqueCharacter.map(entry -> s.indexOf(entry.getKey())).orElse(-1);
    }
}