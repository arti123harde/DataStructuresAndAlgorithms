package org.solutions.leetcode.string.easy;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CountPairsOfSimilarStrings {

    public static void main(String[] args) {
        System.out.println(similarPairs(new String[]{"aba","aabb","abcd","bac","aabc"}));
        System.out.println(similarPairs(new String[]{"aabb","ab","ba"}));
        System.out.println(similarPairs(new String[]{"nba","cba","dba"}));
    }

    public static int similarPairs(String[] words) {
        int count = 0;
        for(int i=0; i<words.length-1; i++){
            for(int j=i+1; j< words.length; j++){
                Set<Character> set1 = words[i].chars().mapToObj(c1 -> (char)c1).collect(Collectors.toCollection(LinkedHashSet::new))
                        .stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
                Set<Character> set2 = words[j].chars().mapToObj(c1 -> (char)c1).collect(Collectors.toCollection(LinkedHashSet::new))
                        .stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
                if(set1.equals(set2)){
                    count++;
                }
            }
        }
        return count;
    }
}
