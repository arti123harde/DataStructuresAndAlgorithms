package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class RansomNote {

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        List<String> literals = new ArrayList<>(List.of(magazine.split("")));
        for(char c : ransomNote.toCharArray()){
            if(!literals.remove(String.valueOf(c))){
                return false;
            }
        }
        return true;
    }
}