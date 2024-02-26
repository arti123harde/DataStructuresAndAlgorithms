package org.solutions.leetcode.string.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringHalvesAlike {

    public static void main(String[] args) {
        System.out.println(halvesAreAlike2("book"));
        System.out.println(halvesAreAlike2("textbook"));
    }

    public static boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        List<Character> l1 = s.substring(0, s.length()/2).chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        List<Character> l2 = s.substring(s.length()/2).chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        return l1.stream().filter(vowels::contains).count() == l2.stream().filter(vowels::contains).count();
    }

    public static boolean halvesAreAlike2(String s) {
        Set<Character> vowels = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int lc = 0;
        int rc = 0;
        int midIndex = s.length()/2;
        for(int i=0; i<midIndex; i++){
            if(vowels.contains(s.charAt(i))){
                lc++;
            }
            if(vowels.contains(s.charAt(i+midIndex))){
                rc++;
            }
        }
        return lc == rc;
    }
}
