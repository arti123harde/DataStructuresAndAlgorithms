package org.solutions.string;

public class ConsistentStrings {

    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
        System.out.println(countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
        System.out.println(countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words){
            if(word.replaceAll("[" + allowed + "]", "").length() == 0){
                count++;
            }
        }
        return count;
    }
}
