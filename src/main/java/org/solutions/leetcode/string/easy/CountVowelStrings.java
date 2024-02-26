package org.solutions.leetcode.string.easy;

import java.util.Arrays;
import java.util.List;

public class CountVowelStrings {

    public static void main(String[] args) {
        System.out.println(vowelStrings(new String[]{"are","amy","u"}, 0,2));
        System.out.println(vowelStrings(new String[]{"hey","aeo","mu","ooo","artro"}, 1,4));
    }

    public static int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        List<Character> characters = Arrays .asList('a', 'e', 'i', 'o', 'u');
        for(int i=left; i<=right; i++){
            if(characters.contains(words[i].charAt(0)) && characters.contains(words[i].charAt(words[i].length()-1))){
                count++;
            }
        }
        return count;
    }
}
