package org.solutions.string;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MorseCodeWords {

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}));
        System.out.println(uniqueMorseRepresentations(new String[]{"a"}));
    }

    //a - 97 index : 0
    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] strings = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",
                ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String word : words){
            StringBuilder key = new StringBuilder();
            for(char c : word.toCharArray()){
                key.append(strings[c - 97]);
            }
            set.add(key.toString());
        }
        return set.size();
    }

}
