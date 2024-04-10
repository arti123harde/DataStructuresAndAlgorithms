package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class NumberOfPairsOfStringsWithConcatenationEqualToTarget {

    public static void main(String[] args) {
        System.out.println(numOfPairs(new String[]{"777","7","77","77"}, "7777"));
        System.out.println(numOfPairs(new String[]{"123","4","12","34"}, "1234"));
        System.out.println(numOfPairs(new String[]{"1","1","1"}, "11"));
    }

    public static int numOfPairs(String[] nums, String target) {
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if((nums[i] + nums[j]).equals(target)){
                    count++;
                }
                if((nums[j] + nums[i]).equals(target)){
                    count++;
                }
            }
        }
        return count;
    }

}