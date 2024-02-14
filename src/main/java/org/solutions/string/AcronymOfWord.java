package org.solutions.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AcronymOfWord {

    public static void main(String[] args) {
        System.out.println(isAcronym(Arrays.asList("alice","bob","charlie"), "abc"));
        System.out.println(isAcronym(Arrays.asList("an","apple"), "abc"));
        System.out.println(isAcronym(Arrays.asList("never","gonna","give","up","on","you"), "ngguoy"));
    }

    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder s1 = new StringBuilder();
        for (String word : words){
            s1.append(word.charAt(0));
        }
        return s1.toString().equals(s);
    }
}
