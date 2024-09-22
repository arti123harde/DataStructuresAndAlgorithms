package org.dsa.arrays;

public class MatchSubarrayPattern {

    public static void main(String[] args) {
        System.out.println(countMatchingSubarrays(new int[]{1,2,3,4,5,6}, new int[]{1,1}));
        System.out.println(countMatchingSubarrays(new int[]{1,4,4,1,3,5,5,3}, new int[]{1,0,-1}));
    }

    public static int countMatchingSubarrays(int[] nums, int[] pattern) {
        int count = 0;
        for(int i=0; i<nums.length-pattern.length; i++){
            int temp = 0;
            for(int j=0; j<pattern.length; j++){
                if(pattern[j] == 1 && nums[i+j+1] > nums[i+j]){
                    temp ++;
                }else if(pattern[j] == 0 && nums[i+j+1] == nums[i+j]){
                    temp++;
                }else if(pattern[j] == -1 && nums[i+j+1] < nums[i+j]){
                    temp++;
                }
            }
            if(temp == pattern.length){
                count++;
            }
        }
        return count;
    }
}
