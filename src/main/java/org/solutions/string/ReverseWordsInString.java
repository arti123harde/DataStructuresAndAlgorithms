package org.solutions.string;

public class ReverseWordsInString {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] splits = s.split(" ");
        for (int i=0; i<splits.length; i++){
            splits[i] = new StringBuilder(splits[i]).reverse().toString();
        }
        return String.join(" ", splits);
    }

}
