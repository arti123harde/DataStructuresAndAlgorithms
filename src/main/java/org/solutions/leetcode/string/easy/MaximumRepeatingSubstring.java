package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class MaximumRepeatingSubstring {

    public static void main(String[] args) {
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
        System.out.println(maxRepeating("ababc", "ab"));
        System.out.println(maxRepeating("ababc", "ba"));
        System.out.println(maxRepeating("ababc", "ac"));
    }

    public static int maxRepeating(String sequence, String word) {
        int index = 0;
        while (word.length() <= sequence.length()){
            index++;
            if(!sequence.contains(word.repeat(index))){
                break;
            }
        }
        return index != 0 ? index - 1 : index;
    }

    public static int maxRepeating1(String sequence, String word) {
        int len1 = sequence.length();
        int len2 = sequence.replaceAll(word, "").length();
        int diff = len1 - len2;
        return diff == 0 ? diff : diff / word.length();
    }
}