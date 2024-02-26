package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class NumberOfValidWordsInSentence {

    public static void main(String[] args) {
        System.out.println(countValidWords("!"));
        System.out.println(countValidWords("a"));
        System.out.println(countValidWords("cat and  dog"));
        System.out.println(countValidWords("!this  1-s b8d!"));
        System.out.println(countValidWords("alice and  bob are playing stone-game10"));
    }

    public static int countValidWords(String sentence) {
        int count = 0;
        String[] splits = sentence.split(" ");
        for(String s : splits){
            s = s.trim();
            if(s.matches("[!.,]") || s.matches("[a-z]+[!.,]?") || s.matches("[a-z]+") || s.matches("[a-z]+[-]?[a-z]+[!.,]?")){
                count++;
            }
        }
        return count;
    }
}