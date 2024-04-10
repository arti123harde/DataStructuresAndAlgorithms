package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class PartitionLabels {

    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println(partitionLabels("eccbbbbdec"));
    }

    public static List<Integer> partitionLabels(String s) {
        List<Integer> integers = new ArrayList<>();
        int startIndex = 0;
        int maxIndex = 0;
        for (int i=0; i<s.length(); i++){
            maxIndex = Math.max(maxIndex, s.lastIndexOf(s.charAt(i)));
            if(i == maxIndex){
                integers.add(i - startIndex + 1);
                startIndex = i + 1;
            }
        }
        return integers;
    }
}