package org.solutions.string;

import java.util.Arrays;

public class EquivalentArrays {

    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        System.out.println(arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        System.out.println(arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        Arrays.stream(word1).forEach(s1::append);
        Arrays.stream(word2).forEach(s2::append);
        return s1.toString().equals(s2.toString());
    }

    public boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        if(word1.length == 0 || word2.length == 0) return false;
        return String.join("", word1).equals(String.join("", word2));
    }
}
