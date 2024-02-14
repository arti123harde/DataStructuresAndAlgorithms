package org.solutions.string;

import java.util.Arrays;
import java.util.List;

public class RemoveVowelsFromString {

    public static void main(String[] args) {
        System.out.println(removeVowels("leetcodeisacommunityforcoders"));
        System.out.println(removeVowels("aeiou"));

        System.out.println(removeVowels1("leetcodeisacommunityforcoders"));
        System.out.println(removeVowels1("aeiou"));
    }

    private static String removeVowels(String s){
        StringBuilder str = new StringBuilder();
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o','u');
        for(int i=0; i<s.length(); i++){
            if(!vowels.contains(s.charAt(i))){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    private static String removeVowels1(String s){
        return s.replaceAll("[aeiou]", "");
    }

}
