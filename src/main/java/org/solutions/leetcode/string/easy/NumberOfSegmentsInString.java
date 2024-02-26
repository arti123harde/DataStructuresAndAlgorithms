package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class NumberOfSegmentsInString {

    public static void main(String[] args) {
        System.out.println(countSegments(", , , ,        a, eaefa"));
        System.out.println(countSegments(""));
        System.out.println(countSegments("Hello, my name is John"));
        System.out.println(countSegments("Hello"));
    }

    public static int countSegments(String s) {
        int count = 0;
        String[] splits =  s.split(" ");
        for(String s1 : splits){
            if(!s1.equals("")){
                count++;
            }
        }
       return count;
    }
}