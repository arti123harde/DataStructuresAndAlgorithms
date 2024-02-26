package org.solutions.leetcode.string.easy;

import java.util.HashSet;
import java.util.Set;

public class ShortestDistanceToCharacter {

    public static void main(String[] args) {
        printArray(shortestToChar("loveleetcode", 'e'));
        printArray(shortestToChar("aaab", 'b'));
        printArray(shortestToChar("qwkbdsdsldss", 'l'));
    }

    public static int[] shortestToChar(String s, char c) {
        Set<Integer> integerSet = new HashSet<>();
        int[] distance = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                integerSet.add(i);
            }
        }
        for(int i=0; i<s.length(); i++){
            int min = Integer.MAX_VALUE;
            for(Integer j : integerSet){
                if(Math.abs(j-i) < min){
                    min = Math.abs(j-i);
                }
            }
            distance[i] = min;
        }
        return distance;
    }

    private static void printArray(int[] array){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(" , ");
            }
        }
        System.out.println("]");
    }
}
