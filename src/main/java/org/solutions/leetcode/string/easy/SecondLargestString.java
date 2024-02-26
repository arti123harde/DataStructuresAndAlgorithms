package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Arti Harde
 */
public class SecondLargestString {

    public static void main(String[] args) {
        System.out.println(secondHighest("ck077"));
        System.out.println(secondHighest("dfa12321afd"));
        System.out.println(secondHighest("abc1111"));
    }

    public static int secondHighest(String s) {
        List<Integer> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                int d = Integer.parseInt(String.valueOf(ch));
                if(!list.contains(d)){
                    list.add(d);
                }
            }
        }
        if(list.size() < 2){
            return -1;
        }else {
            list.sort(Collections.reverseOrder());
            return list.get(1);
        }
    }
}