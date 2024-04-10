package org.solutions.leetcode.string.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class OptimalPartitionOfStrings {

    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
        System.out.println(partitionString("ssssss"));
    }

    public static int partitionString(String s) {
        int count = 0;
        Set<Character> characterSet = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(characterSet.contains(s.charAt(i))){
                count++;
                characterSet = new HashSet<>();
            }
            characterSet.add(s.charAt(i));
        }
        return ++count;
    }
}