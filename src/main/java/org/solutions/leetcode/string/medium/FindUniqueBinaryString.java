package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class FindUniqueBinaryString {

    public static void main(String[] args) {
        System.out.println(findDifferentBinaryString(new String[]{"01","10"}));
        System.out.println(findDifferentBinaryString(new String[]{"00","01"}));
        System.out.println(findDifferentBinaryString(new String[]{"111","011","001"}));
    }

    public static String findDifferentBinaryString(String[] nums) {
        List<String> list = new ArrayList<>(List.of(nums));
        int maxValue = Integer.parseInt("1".repeat(nums[0].length()), 2);
        for(int i=1; i<=maxValue; i++){
            String binaryString = Integer.toBinaryString(i);
            String s = "0".repeat(nums[0].length() - binaryString.length()) + binaryString;
            if(!list.contains(s)){
                return s;
            }
        }
        return "0";
    }
}