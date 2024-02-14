package org.solutions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {1,8,2,7,3,11,-2,6,4,5};
//        int[] array = {2,7,11,15};
        int target = 9;

        System.out.println("\nTwoSum Array elements : ");
        List<int[]> result = findTwoSum(array, target);
        for(int[] arr : result){
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("\nTwoSum Array Indexes : ");
        result = findTwoSumIndexes(array, target);
        for(int[] arr : result){
            System.out.println(Arrays.toString(arr));
        }

    }

    /**
     * Maintain two pointers i(0) from start and j(length-1) from end
     * keep i constant and check sum of ith and jth elements and decrease j pointer accordingly.
     */
    private static List<int[]> findTwoSum(int[] array, int target){
        List<int[]> result = new ArrayList<>();
        int length = array.length;
        for(int i=0; i<length; i++){
            for(int j=length-1; j!=i; j--){
                if(array[i] + array[j] == target){
                    result.add(new int[]{array[i], array[j]});
                }
            }
        }
        return result;
    }

    private static List<int[]> findTwoSumIndexes(int[] array, int target){
        List<int[]> result = new ArrayList<>();
        int length = array.length;
        for(int i=0; i<length; i++){
            for(int j=length-1; j!=i; j--){
                if(array[i] + array[j] == target){
                    result.add(new int[]{i,j});
                    break;
                }
            }
        }
        return result;
    }
}
