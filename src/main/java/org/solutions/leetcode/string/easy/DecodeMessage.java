package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DecodeMessage {

    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        System.out.println(decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));

    }

    public static String decodeMessage(String key, String message) {
        StringBuilder string = new StringBuilder();
        int count = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i<key.length(); i++){
            if(!Character.isWhitespace(key.charAt(i)) && !hashMap.containsKey(key.charAt(i))){
                hashMap.put(key.charAt(i), count);
                count ++;
            }
        }
        for(int i=0; i<message.length(); i++){
            if(Character.isWhitespace(message.charAt(i))){
                string.append(" ");
            }else if(hashMap.containsKey(message.charAt(i))){
                string.append((char) ('a' + hashMap.get(message.charAt(i))));
            }
        }
        return string.toString();
    }
}
