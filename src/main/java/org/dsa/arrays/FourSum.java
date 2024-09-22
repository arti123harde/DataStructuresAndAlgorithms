package org.dsa.arrays;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FourSum {

    public static void main(String[] args) {
        int[] nums1 = {1,0,-2,-1,0,-2,2,-1};
        int[] nums2 = {2,2,2,2,2};
        int[] nums3 = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        int[] nums4 = {1000000000,1000000000,1000000000,1000000000};
        int[] nums5 = {-492,-465,-454,-450,-416,-403,-384,-378,-377,-368,-360,-341,-325,
                -322,-315,-310,-309,-284,-275,-274,-271,-264,-255,-248,-245,-232,-222,-212,
                -211,-204,-184,-137,-133,-128,-120,-117,-109,-92,-88,-61,19,19,32,37,39,55,60,94,
                98,187,187,216,254,272,284,284,290,295,323,328,336,411,428,440};
        int[] nums6 = {0,0,0,1000000000,1000000000,1000000000,1000000000};
        int target1 = 0;
        int target2 = 8;
        int target3 = 8;
        int target4 = -294967296;
        int target5 = 1154;
        int target6 = 1000000000;

        long start = Instant.now().toEpochMilli();
        System.out.println("\nFourSum Array elements : ");
        Set<List<Integer>> result = optimizedFourSum(nums6, target6);
        System.out.println("Total Time Taken in MilliSeconds: " + (Instant.now().toEpochMilli() - start));
        for (List<Integer> set : result){
            System.out.println(set);
        }

//        System.out.println("\nFourSum Array element Indexes : ");
//        result = fourSumIndexes(nums3, target3);
//        for (List<Integer> set : result){
//            System.out.println(set);
//        }
    }

    /**
     *
     * Constraints:
     * 1 <= nums.length <= 200
     * -10^9 <= nums[i] <= 10^9
     * -10^9 <= target <= 10^9
     *
     * Sorting array will take care of avoiding duplicate quadruples
     */
    public static Set<List<Integer>> optimizedFourSum(int[] nums, int target){
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        if (nums.length <= 200 && nums.length >= 1 && target >= -Math.pow(10, 9) && target <= Math.pow(10, 9)) {
            if ((Arrays.stream(nums).boxed().collect(Collectors.toList())).stream().distinct().count() == 1
                    && nums.length >= 4) {
                if (nums[0] + nums[1] + nums[2] + nums[3] == target) {
                    set.add(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));
                }
            } else {
                int len = nums.length;
                for (int i = 0; i < len; i++) {
                    for (int j = i + 1; j < len; j++) {
                        int k = j+1;
                        int l = len-1;
                        while (k < l){
                            long sum = nums[i] + nums[j] + nums[k] + nums[l];
                            if (validateNum(nums[i]) && validateNum(nums[j]) && validateNum(nums[k])
                                    && validateNum(nums[l])) {
                                if (sum == target) {
                                    set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                                    k++;
                                    l--;
                                }else if(sum < target){
                                    k++;
                                }else{
                                    l--;
                                }
                            }
                        }
                    }
                }
            }
        }
        return set;
    }


    /**
     *
     * Constraints:
     * 1 <= nums.length <= 200
     * -10^9 <= nums[i] <= 10^9
     * -10^9 <= target <= 10^9
     *
     * Sorting array will take care of avoiding duplicate quadruples
     */
    public static Set<List<Integer>> fourSum(int[] nums, int target){
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        if (nums.length <= 200 && nums.length >= 1 && target >= -Math.pow(10, 9) && target <= Math.pow(10, 9)) {
            if ((Arrays.stream(nums).boxed().collect(Collectors.toList())).stream().distinct().count() == 1
                    && nums.length >= 4) {
                if (nums[0] + nums[1] + nums[2] + nums[3] == target) {
                    set.add(Arrays.asList(nums[0], nums[1], nums[2], nums[3]));
                }
            } else {
                int len = nums.length;
                for (int i = 0; i < len; i++) {
                    for (int j = i + 1; j < len; j++) {
                        for (int k = j + 1; k < len; k++) {
                            for (int l = len - 1; l > k; l--) {
                                int sum = nums[i] + nums[j] + nums[k] + nums[l];
                                if (validateNum(nums[i]) && validateNum(nums[j]) && validateNum(nums[k])
                                        && validateNum(nums[l])) {
                                    if (sum == target) {
                                        set.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return set;
    }

    private static boolean validateNum(int num){
        return num >= -Math.pow(10,9) && num <= Math.pow(10,9);
    }

    public static Set<List<Integer>> fourSumIndexes(int[] nums, int target){
        Set<List<Integer>> set = new HashSet<>();
        int len = nums.length;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                for(int k=j+1; k<len; k++){
                    for(int l=len-1; l>k; l--){
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target){
                            set.add(Arrays.asList(i,j,k,l));
                        }
                    }
                }
            }
        }
        return set;
    }
}
