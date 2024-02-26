package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

    public static void main(String[] args) {
        System.out.println(fullJustify(new String[]{"This", "is", "an", "example", "of",
                "text", "justification."}, 16));
        System.out.println(fullJustify(new String[]{"What","must","be","acknowledgment","shall","be"}, 16));
        System.out.println(fullJustify(new String[]{"Science","is","what","we","understand","well",
                "enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"}, 20));
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> list = new ArrayList<>();

        String tempStr = "";
        for(int i=0; i<words.length; i++){
            if(words[i].length() + words[i+1].length() <= maxWidth-1){
                tempStr = tempStr + words[i] + " " + words[i+1];
            }else if(words[i].length() + words[i+1].length() <= maxWidth-1){

            }
        }
        return list;
    }
}
