package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class IsomorphicStrings {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
        System.out.println(isIsomorphic("egcd", "adfd"));
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                if(!map.containsValue(t.charAt(i))){
                    map.put(s.charAt(i), t.charAt(i));
                }else {
                    return false;
                }
            }else if(map.containsKey(s.charAt(i)) && !map.get(s.charAt(i)).equals(t.charAt(i))){
                return false;
            }
        }
        return true;
    }
}