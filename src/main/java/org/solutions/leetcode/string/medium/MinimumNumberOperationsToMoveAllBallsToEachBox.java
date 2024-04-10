package org.solutions.leetcode.string.medium;

import org.solutions.leetcode.string.easy.PrintUtil;

/**
 * @author Arti Harde
 */
public class MinimumNumberOperationsToMoveAllBallsToEachBox {

    public static void main(String[] args) {
        PrintUtil.printArray(minOperations("110"));
        PrintUtil.printArray(minOperations("001011"));
    }

    public static int[] minOperations(String boxes) {
        int[] operations = new int[boxes.length()];
        for(int i =0; i<boxes.length(); i++){
            int count = 0;
            for(int j=0; j<boxes.length(); j++){
                if(i!=j && boxes.charAt(j)=='1'){
                    count = count + Math.abs(j-i);
                }
            }
            operations[i] = count;
        }
        return operations;
    }
}