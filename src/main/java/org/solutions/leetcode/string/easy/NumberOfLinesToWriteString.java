package org.solutions.leetcode.string.easy;

public class NumberOfLinesToWriteString {

    public static void main(String[] args) {
        printArray(numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz"));
        printArray(numberOfLines(new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa"));
        printArray(numberOfLines(new int[]{3,4,10,4,8,7,3,3,4,9,8,2,9,6,2,8,4,9,9,10,2,4,9,10,8,2}, "mqblbtpvicqhbrejb"));
    }

    public static int[] numberOfLines(int[] widths, String s) {
        int lineCount = 1;
        int lineWidth = 0;
        for(char c : s.toCharArray()){
            if(lineWidth == 100){
                lineWidth = 0;
                lineCount++;
            }
            if((lineWidth + widths[c - 'a']) <= 100){
                lineWidth = lineWidth + widths[c - 'a'];
            }else{
                lineWidth = widths[c - 'a'];
                lineCount++;
            }
        }
        return new int[]{lineCount, lineWidth};
    }

    private static void printArray(int[] array){
        System.out.print("[");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i != array.length-1){
                System.out.print(" , ");
            }
        }
        System.out.println("]");
    }

}
