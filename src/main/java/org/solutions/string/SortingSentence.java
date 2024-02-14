package org.solutions.string;

import java.util.Arrays;

public class SortingSentence {

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));
    }

    public static String sortSentence(String s) {
        String[] splits = s.split(" ");
        String[] strings = new String[splits.length];
        for(String s2 : splits){
            int index = s2.charAt(s2.length() - 1) - 48;
            strings[index-1] = s2.substring(0, s2.length()-1);
        }
        return String.join(" ", strings);
    }
}
