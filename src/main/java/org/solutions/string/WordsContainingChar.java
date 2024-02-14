package org.solutions.string;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingChar {

    public static void main(String[] args) {
        System.out.println(findWordsContaining(new String[]{"leet","code"}, 'e'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        int c = 0;
        for(String w : words){
            if(w.contains(String.valueOf(x))){
                result.add(c);
            }
            c++;
        }
        return result;
    }
}
