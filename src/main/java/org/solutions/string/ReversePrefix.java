package org.solutions.string;

import java.util.HashMap;

public class ReversePrefix {

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
        System.out.println(reversePrefix("xyxzxe", 'z'));
        System.out.println(reversePrefix("abcd", 'z'));
        System.out.println(reversePrefix("j", 'j'));
        System.out.println(reversePrefix("xxxxxxxxxx", 'x'));
    }

    public static String reversePrefix(String word, char ch) {
        if(word.equals(String.valueOf(ch))){
            return word;
        }else if(word.contains(String.valueOf(ch))){
            String[] splits = word.split(String.valueOf(ch));
            if(splits.length == 0){
                return word;
            }else {
                String reversedString = ch + new StringBuilder(splits[0]).reverse().toString();
                if(reversedString.length() != word.length()){
                    return reversedString + word.substring(reversedString.length());
                }else {
                    return reversedString;
                }
            }
        }
        return word;
    }

}
