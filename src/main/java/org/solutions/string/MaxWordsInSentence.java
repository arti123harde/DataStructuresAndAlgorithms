package org.solutions.string;

import java.util.Arrays;

public class MaxWordsInSentence {

    public static void main(String[] args) {
        System.out.println(mostWordsFound(new String[]{"alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"}));
        System.out.println(mostWordsFound(new String[]{"please wait", "continue to fight", "continue to win"}));
    }

    public static int mostWordsFound1(String[] sentences) {
        int count = 0;
        for(String sentence : sentences){
            long c = sentence.chars().filter(Character::isWhitespace).count();
            count = Math.max(count, ((int)c + 1));
        }
        return count;
    }

    public static int mostWordsFound(String[] sentences) {
        int count = 0;
        for(String sentence : sentences){
            int c = sentence.split(" ").length;
            count = Math.max(count, c);
        }
        return count;
    }
}
