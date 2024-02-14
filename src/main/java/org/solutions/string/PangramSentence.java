package org.solutions.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PangramSentence {

    //A pangram is a sentence where every letter of the English alphabet appears at least once.
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
    }

    public static boolean checkIfPangram(String sentence) {
        Set<Character> hashSet = new HashSet<>();
        for(Character character : sentence.toCharArray()){
            hashSet.add(character);
        }
        return hashSet.size() == 26;
    }
}
