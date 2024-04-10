package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class NumberOfDivisibleSubstrings {

    public static void main(String[] args) {
        System.out.println(countDivisibleSubstrings("asdf"));
        System.out.println(countDivisibleSubstrings("bdh"));
        System.out.println(countDivisibleSubstrings("abcd"));
    }

    public static int countDivisibleSubstrings(String word) {
        int[] mapping = {1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9};
        int count = 0;
        for(int i=0; i<word.length(); i++){
            int sum = 0;
            for(int j=i; j<word.length(); j++){
                sum = sum + mapping[word.charAt(j) - 'a'];
                int len = j - i + 1;
                if(sum % len == 0){
                    count++;
                }
            }
        }
        return count;
    }

}