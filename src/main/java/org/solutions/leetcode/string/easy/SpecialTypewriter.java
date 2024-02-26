package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

public class SpecialTypewriter {


    public static void main(String[] args) {
        System.out.println(minTimeToType("abc"));
        System.out.println(minTimeToType("bza"));
        System.out.println(minTimeToType("zjpc"));
    }

    public static int minTimeToType(String word) {
        int time = 0;
        Map<Character, Integer> distance = new HashMap<>();
        for(int i=0; i<13; i++){
            distance.put((char) ('a' + i), i);
        }
        for(int i=13; i<26; i++){
            distance.put((char) ('a' + i), 26-i);
        }
        if(word.charAt(0) == 'a'){
            time = 1;
        }else{
            time = distance.get(word.charAt(0)) + 1;
        }
        for(int i=1; i<word.length(); i++){
            int d = word.charAt(i-1) > word.charAt(i) ?  word.charAt(i-1) - word.charAt(i) : word.charAt(i) - word.charAt(i-1);
            int t1 = distance.get(word.charAt(i-1));
            int t2 = distance.get(word.charAt(i));
            if(d < 13){
                time = time + 1 + d;
            }else{
                time = time + 1 + t1 + t2;
            }
        }
        return time;
    }
}
