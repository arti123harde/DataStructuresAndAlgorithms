package org.solutions.leetcode.string.easy;

public class StringPairs {


    public static void main(String[] args) {
        System.out.println(maximumNumberOfStringPairs(new String[]{"cd","ac","dc","ca","zz"}));
        System.out.println(maximumNumberOfStringPairs(new String[]{"ab","ba","cc"}));
        System.out.println(maximumNumberOfStringPairs(new String[]{"aa","ba"}));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                System.out.println("Iteration i = " + i + " j = " + j);
                if(new StringBuilder(words[i]).reverse().toString().equals(words[j])){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
