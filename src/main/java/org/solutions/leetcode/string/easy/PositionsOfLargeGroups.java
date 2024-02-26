package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class PositionsOfLargeGroups {

    public static void main(String[] args) {
        System.out.println(largeGroupPositions("abbxxxxzzy"));
        System.out.println(largeGroupPositions("abc"));
        System.out.println(largeGroupPositions("abcdddeeeeaabbbcd"));
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int index = 0;
        while (index < s.length()){
            char c = s.charAt(index);
            int endIndex = index;
            while (endIndex<s.length() && s.charAt(endIndex) == c){
                endIndex++;
            }
            if(endIndex - index >= 3){
                list.add(Arrays.asList(index, endIndex-1));
            }
            index = endIndex;
        }
        return list;
    }
}