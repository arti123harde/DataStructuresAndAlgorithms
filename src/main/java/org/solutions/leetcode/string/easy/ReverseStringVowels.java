package org.solutions.leetcode.string.easy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class ReverseStringVowels {

    public static void main(String[] args) {
        System.out.println(reverseVowels("aAEe"));
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while (i < j){
            if(vowels.contains(chars[i]) && vowels.contains(chars[j])){
                char c = chars[i];
                chars[i] = chars[j];
                chars[j] = c;
                i++;
                j--;
            }
            if(!vowels.contains(chars[i])){
                i++;
            }
            if(!vowels.contains(chars[j])){
                j--;
            }
        }
        return new String(chars);
    }
}