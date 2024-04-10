package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Arti Harde
 */
public class SortVowels {

    public static void main(String[] args) {
        System.out.println(sortVowels("aaaaaaAAAAAAAAAaaaaUUUUIIIoooooooooooAAAAAAA"));
        System.out.println(sortVowels("LQRamBOHfq"));
        System.out.println(sortVowels("lEetcOde"));
        System.out.println(sortVowels("lYmpH"));
    }

    public static String sortVowels(String s) {
        if(s.matches("[AEIOUaeiou]+")){
            List<Character> list = s.chars().mapToObj(c -> (char) c).sorted().collect(Collectors.toList());
            return list.stream().map(String::valueOf).collect(Collectors.joining());
        }
        List<Character> characters = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        List<Character> chars = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        char[] string = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            if(characters.contains(s.charAt(i))){
                chars.add(s.charAt(i));
                integers.add(i);
            }
        }
        if(chars.size() > 0){
            Collections.sort(chars);
            for(int i=0,j=0; i<s.length(); i++){
                if(integers.contains(i)){
                    string[i] = chars.get(j);
                    j++;
                }else{
                    string[i] = s.charAt(i);
                }
            }
            return new String(string);
        }
        return s;
    }
}