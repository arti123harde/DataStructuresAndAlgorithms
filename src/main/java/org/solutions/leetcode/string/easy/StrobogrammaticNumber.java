package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class StrobogrammaticNumber {

    public static void main(String[] args) {
        System.out.println(isStrobogrammatic("659"));
        System.out.println(isStrobogrammatic("69"));
        System.out.println(isStrobogrammatic("88"));
        System.out.println(isStrobogrammatic("962"));
        System.out.println(isStrobogrammatic("3"));
        System.out.println(isStrobogrammatic("6"));
    }

    public static boolean isStrobogrammatic(String num) {
        boolean result = false;
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');
        if(num.length() == 1 && (num.equals("1") || num.equals( "0") || num.equals( "8"))){
            result = true;
        }else {
            for(int i=0; i<num.length()/2 + 1; i++){
                if(map.containsKey(num.charAt(i)) && map.get(num.charAt(i)).equals(num.charAt(num.length() - 1 - i))){
                    result = true;
                }else{
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}