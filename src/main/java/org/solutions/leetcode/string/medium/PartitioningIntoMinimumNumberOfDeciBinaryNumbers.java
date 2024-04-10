package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public static void main(String[] args) {
        System.out.println(minPartitions("32"));
        System.out.println(minPartitions("82734"));
        System.out.println(minPartitions("27346209830709182346"));
    }


    public static int minPartitions(String n) {
        char c = 0;
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i) > c){
                c = n.charAt(i);
            }
        }
        return Integer.parseInt(String.valueOf(c));
    }
}