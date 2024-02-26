package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class LongestUnequalAdjacentGroupsSubsequenceI {

    public static void main(String[] args) {
        System.out.println(getLongestSubsequence(new int[]{0,0,1}));
        System.out.println(getLongestSubsequence(new int[]{1,0,1,1}));
        System.out.println(getLongestSubsequence(new int[]{1,0,0,1}));
    }

    public static List<Integer> getLongestSubsequence(int[] groups) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<groups.length; i++){
            if((i+1)<groups.length && groups[i] != groups[i+1]){
                if(!list.isEmpty() && groups[list.get(list.size()-1)] == groups[i]){
                    list.add(i+1);
                }else{
                    list.add(i);
                    list.add(i+1);
                }
            }
        }
        if(list.isEmpty()){
            list.add(0);
        }
        return list;
    }
}