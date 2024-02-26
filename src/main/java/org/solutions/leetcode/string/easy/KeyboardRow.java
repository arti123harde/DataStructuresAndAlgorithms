package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeyboardRow {

    public static void main(String[] args) {
        printArray(findWords(new String[]{"Hello","Alaska","Dad","Peace"}));
        printArray(findWords(new String[]{"omk"}));
        printArray(findWords(new String[]{"adsdf","sfd"}));
    }

    public static String[] findWords(String[] words) {
        List<Character> firstRow = Arrays.asList('q','w','e','r','t','y','u','i','o','p');
        List<Character> secondRow = Arrays.asList('a','s','d','f','g','h','j','k','l');
        List<Character> thirdRow = Arrays.asList('z','x','c','v','b','n','m');
        List<String> result = new ArrayList<>();
        for(String word : words){
            if(checkIfWordPresentInRow(word, firstRow) || checkIfWordPresentInRow(word, secondRow)
                    || checkIfWordPresentInRow(word, thirdRow)){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }

    private static boolean checkIfWordPresentInRow(String word, List<Character> keyboardRow){
        for(char c : word.toLowerCase().toCharArray()){
            if(!keyboardRow.contains(c)){
                return false;
            }
        }
        return true;
    }

    private static void printArray(String[] words){
        for(String word : words){
            System.out.println(word + " ");
        }
        System.out.println();
    }
}
