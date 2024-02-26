package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class StringMatchingInArray {

    public static void main(String[] args) {
        System.out.println(stringMatching(new String[]{"mass","as","hero","superhero"}));
        System.out.println(stringMatching(new String[]{"leetcode","et","code"}));
    }

    public static List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                if(i!=j && words[j].contains(words[i])){
                    set.add(words[i]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}