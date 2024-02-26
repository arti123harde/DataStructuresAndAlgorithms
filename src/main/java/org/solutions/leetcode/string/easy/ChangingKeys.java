package org.solutions.leetcode.string.easy;

public class ChangingKeys {

    public static void main(String[] args) {
        System.out.println(countKeyChanges("aAbBcC"));
        System.out.println(countKeyChanges("AaAaAaaA"));
    }

    public static int countKeyChanges(String s) {
        int count = 0;
        int i = 0;
        s = s.toUpperCase();
        while (i < s.length()-1){
            if(s.charAt(i) != s.charAt(i+1)){
                count ++;
            }
            i++;
        }
        return count;
    }
}
