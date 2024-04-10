package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class LetterCasePermutation {

    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
        System.out.println(letterCasePermutation("3z4"));
    }

    public static List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        recursion(s.toCharArray(), 0, result);
        return result;
    }

    public static void recursion(char[] str, int index, List<String> result) {
        if (index == str.length) {
            result.add(new String(str));
            return;
        }
        if (Character.isLetter(str[index])) {
            if (Character.isUpperCase(str[index])) {
                str[index] = Character.toLowerCase(str[index]);
                recursion(str, index + 1, result);
                str[index] = Character.toUpperCase(str[index]);
            }else {
                str[index] = Character.toUpperCase(str[index]);
                recursion(str, index + 1, result);
                str[index] = Character.toLowerCase(str[index]);
            }
        }
        recursion(str, index + 1, result);
    }
}