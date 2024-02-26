package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class RearrangeSpacesBetweenWords {

    public static void main(String[] args) {
        System.out.println("[" + reorderSpaces("  this   is  a sentence ") + "]");
        System.out.println("[" + reorderSpaces(" practice   makes   perfect") + "]");
    }

    public static String reorderSpaces(String text) {
        int noOfSpaces = 0;
        List<String> strings = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(char ch : text.toCharArray()){
            if(Character.isWhitespace(ch)){
                noOfSpaces ++;
                if(stringBuilder.length() > 0){
                    strings.add(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder();
            }else {
                stringBuilder.append(ch);
            }
        }
        if(stringBuilder.length() > 0){
            strings.add(stringBuilder.toString());
        }
        if(noOfSpaces == 0){
            return text;
        }else if(strings.size() == 1){
            return strings.get(0) + " ".repeat(noOfSpaces);
        }else{
            int d = noOfSpaces / (strings.size() - 1);
            int e = noOfSpaces % (strings.size() - 1);
            return String.join(" ".repeat(d), strings) + " ".repeat(e);
        }
    }
}