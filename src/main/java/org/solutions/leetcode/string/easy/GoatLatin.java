package org.solutions.leetcode.string.easy;

import java.util.Arrays;
import java.util.List;

public class GoatLatin {

    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

    public static String toGoatLatin(String sentence) {
        String[] splits = sentence.split(" ");
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for(int i=0; i< splits.length; i++){
            StringBuilder stringBuilder = new StringBuilder();
            if(vowels.contains(splits[i].charAt(0))){
                stringBuilder.append(splits[i]);
            }else{
                stringBuilder.append(splits[i].substring(1)).append(splits[i].charAt(0));
            }
            stringBuilder.append("ma").append("a".repeat(i+1));
            splits[i] = stringBuilder.toString();
        }
        return String.join(" ", splits);
    }
}
