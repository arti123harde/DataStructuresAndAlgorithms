package org.solutions.string;

import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLength {

    public static void main(String[] args) {
        System.out.println(minimizedStringLength("aaabc"));
        System.out.println(minimizedStringLength("cbbd"));
        System.out.println(minimizedStringLength("dddaaa"));
    }

    public static int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }
        return set.size();
    }
}
