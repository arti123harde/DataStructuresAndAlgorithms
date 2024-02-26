package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstLetterToAppearTwice {

    public static void main(String[] args) {
        System.out.println(repeatedCharacter("abccbaacz"));
        System.out.println(repeatedCharacter("abcdd"));
    }


    public static char repeatedCharacter(String s) {
        char c = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(char c1 : s.toCharArray()){
            if(!map.containsKey(c1)){
                map.put(c1, 0);
            }
            map.put(c1, map.get(c1) + 1);
            if(map.get(c1) == 2){
                c = c1;
                break;
            }
        }
        return c;
    }
}
