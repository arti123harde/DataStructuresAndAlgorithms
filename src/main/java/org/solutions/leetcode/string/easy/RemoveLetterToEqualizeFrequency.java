package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Arti Harde
 */
public class RemoveLetterToEqualizeFrequency {

    public static void main(String[] args) {
        System.out.println(equalFrequency("aaaabbbbccc"));
        System.out.println(equalFrequency("cccd"));
        System.out.println(equalFrequency("abbcc"));
        System.out.println(equalFrequency("bcaebda"));
        System.out.println(equalFrequency("bac"));
        System.out.println(equalFrequency("zz"));
        System.out.println(equalFrequency("cccaa"));
        System.out.println(equalFrequency("acbda"));
        System.out.println(equalFrequency("aca"));
        System.out.println(equalFrequency("ddaccb"));
        System.out.println(equalFrequency("abcc"));
        System.out.println(equalFrequency("aazz"));
    }

    public static boolean equalFrequency(String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : word.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        int d = (int)list.stream().distinct().count();
        if(d == 1){
            return map.size() == 1 || list.get(0) == 1;
        }else if(d == 2){
            List<Integer> list1 = list.stream().distinct().sorted().collect(Collectors.toList());
            int c1 =  (int)list.stream().filter(integer -> Objects.equals(integer, list1.get(0))).count();
            int c2 =  (int)list.stream().filter(integer -> Objects.equals(integer, list1.get(1))).count();
            if(Math.abs(list1.get(0) - list1.get(1)) == 1){
                if(c2 > c1){
                    return list1.get(0) == 1;
                }else{
                    return c2 == 1;
                }
            }else{
                return (list1.get(0) == 1 && c1 == 1) || (list1.get(1) == 1 && c2 == 1);
            }
        }else {
            return false;
        }
    }
}