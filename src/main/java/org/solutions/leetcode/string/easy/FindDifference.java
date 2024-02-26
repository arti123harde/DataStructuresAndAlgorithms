package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class FindDifference {

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcdt"));
        System.out.println(findTheDifference("", "y"));
    }

    public static char findTheDifference(String s, String t) {
        List<String> list = new ArrayList<>(List.of(t.split("")));
        for(char c : s.toCharArray()){
            list.remove(String.valueOf(c));
        }
        return list.get(0).charAt(0);
    }
}