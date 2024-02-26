package org.solutions.leetcode.string.easy;

import sun.misc.Unsafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Arti Harde
 */
public class LastVisitedInteger {

    public static void main(String[] args) {
        System.out.println(lastVisitedIntegers(Arrays.asList("1","2","prev","prev","prev")));
        System.out.println(lastVisitedIntegers(Arrays.asList("1","prev","2","prev","prev")));
        System.out.println(lastVisitedIntegers(Arrays.asList("prev","prev","prev","52","prev")));
    }

    public static List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        int prevCount = 0;
        for(String word : words){
            if(word.equals("prev")){
                if(prevCount < nums.size()){
                    ans.add(nums.get(prevCount));
                }else{
                    ans.add(-1);
                }
                prevCount++;
            }else{
                prevCount = 0;
                List<Integer> temp = new ArrayList<>(List.of(Integer.parseInt(word)));
                temp.addAll(nums);
                nums = temp;
            }
        }
        return ans;
    }
}