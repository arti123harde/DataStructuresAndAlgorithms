package org.solutions.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagrams {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }

    public static boolean checkIfAnagram(String a, String b){
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        return Arrays.equals(a1, b1);
    }
}
