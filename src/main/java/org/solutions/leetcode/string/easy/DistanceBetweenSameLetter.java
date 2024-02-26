package org.solutions.leetcode.string.easy;

import java.util.HashSet;
import java.util.Set;

public class DistanceBetweenSameLetter {

    public static void main(String[] args) {
        System.out.println(checkDistances("abaccb",new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
        System.out.println(checkDistances("aa",new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}));
    }

    public static boolean checkDistances(String s, int[] distance) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(!set.contains(s.charAt(i))){
                if(distance[s.charAt(i) - 'a'] != (s.lastIndexOf(s.charAt(i)) - i -1)){
                    return false;
                }
                set.add(s.charAt(i));
            }
        }
        return true;
    }
}
