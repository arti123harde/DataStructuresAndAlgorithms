package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public final class PrintUtil {

    public static void printArray(int[] array){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(" , ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(String[] array){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(" , ");
            }
        }
        System.out.println("]");
    }

    public static void printArray(int[][] array){
        System.out.print("[");
        for(int r=0; r<array.length; r++){
            System.out.print("[");
            for(int c=0; c<array[r].length; c++){
                System.out.print(array[r][c]);
                if(c != array[r].length-1){
                    System.out.print(" , ");
                }
            }
            System.out.print("]");
            if(r != array.length-1){
                System.out.print(" , ");
            }
        }
        System.out.println("]");
    }
}