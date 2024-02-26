package org.solutions.leetcode.string.easy;

import java.util.regex.Pattern;

public class MaximumNumberOfWordsYouCanType {

    public static void main(String[] args) {
        System.out.println(canBeTypedWords("hello world", "ad"));
        System.out.println(canBeTypedWords("leet code", "lt"));
        System.out.println(canBeTypedWords("leet code", "e"));
        System.out.println(canBeTypedWords("abc de", " "));
    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        int count = 0;
        String[] words = text.split("");
        if(brokenLetters != " "){
            Pattern regex = Pattern.compile("[" + brokenLetters + "]");
            for(String word : words){
                if(!regex.matcher(word).find()){
                    count++;
                }
            }
        }else{
            count = words.length;
        }
        return count;
    }
}
