package org.solutions.leetcode.string.easy;


import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

public class JewelsAndStones {

    public static void main(String[] args) {
        long start = Instant.now().toEpochMilli();
        System.out.println("Result : " + findNumJewelsInStones("aA", "aAAbbbb") + " Total Time Taken : " + (Instant.now().toEpochMilli()-start) + " ms ");
        start = Instant.now().toEpochMilli();
        System.out.println("Result : " + findNum("aA", "aAAbbbb") + " Total Time Taken : " + (Instant.now().toEpochMilli()-start) + " ms ");

    }

    private static int findNumJewelsInStones(String jewels, String stones){
        int count = 0;
        List<Character> characters = stones.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        for(Character character : jewels.toCharArray()){
            count = count + (int)characters.stream().filter(ch -> ch.equals(character)).count();
        }
        return count;
    }

    private static int findNum(String jewels, String stones){
        String s  = stones.replaceAll("[^" + jewels + "]", "");
        System.out.println(s);
        return s.length();
    }
}
