package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class PerformStringShifts {

    public static void main(String[] args) {
        System.out.println(stringShift("abc", new int[][]{{0,4}}));
        System.out.println(stringShift("abc", new int[][]{{0,1},{1,2}}));
        System.out.println(stringShift("abcdefg", new int[][]{{1,1},{1,1},{0,2},{1,3}}));
        System.out.println(stringShift("a", new int[][]{{1,4},{0,5},{0,4},{1,1},{1,5}}));
        System.out.println(stringShift("mecsk", new int[][]{{1,4},{0,5},{0,4},{1,1},{1,5}}));
    }

    public static String stringShift(String s, int[][] shift) {
        for (int[] ints : shift) {
            s = shiftString(ints[0], s, ints[1]);
        }
        return s;
    }

    private static String shiftString(int direction, String s, int amount){
        if(amount > s.length()){
            amount = amount %s.length();
        }
        if(direction == 1){
            return s.substring(s.length() - amount) + s.substring(0, s.length() - amount);
        }else{
            return s.substring(amount) + s.substring(0, amount);
        }
    }
}