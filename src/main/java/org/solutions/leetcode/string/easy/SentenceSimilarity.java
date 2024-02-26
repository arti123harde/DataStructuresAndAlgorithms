package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @author Arti Harde
 */
public class SentenceSimilarity {

    public static void main(String[] args) {
        System.out.println(areSentencesSimilar(new String[]{"great"}, new String[]{"doubleplus","good"},
                Arrays.asList(Arrays.asList("great","doubleplus"))));
        System.out.println(areSentencesSimilar(new String[]{"great","acting","skills"}, new String[]{"fine","drama","talent"},
                Arrays.asList(Arrays.asList("great","fine"), Arrays.asList("drama","acting"), Arrays.asList("skills","talent"))));
        System.out.println(areSentencesSimilar(new String[]{"great"}, new String[]{"great"}, new ArrayList<>()));
    }

    public static boolean areSentencesSimilar(String[] sentence1, String[] sentence2, List<List<String>> similarPairs) {
        if(sentence1.length != sentence2.length){
            return false;
        }else {
            for(int i=0; i< sentence2.length; i++){
                if(!Objects.equals(sentence2[i], sentence1[i])){
                    String s1 = sentence1[i];
                    String s2 = sentence2[i];
                    Optional<List<String>> listOptional = similarPairs.stream()
                            .filter(list-> list.contains(s1) && list.contains(s2)).findFirst();
                    if(listOptional.isPresent()){
                        sentence2[i] = sentence1[i];
                    }else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}