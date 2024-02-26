package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ExcelColumnNumber {

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
    }

    public static int titleToNumber(String columnTitle) {
        int columnNumber = 0;
        int index = columnTitle.length()-1;
        while (index >= 0){
            int charPosition = columnTitle.charAt(columnTitle.length()-1-index) - 64;
            columnNumber = columnNumber + (int)Math.pow(26, index) * charPosition;
            index--;
        }
        return columnNumber;
    }
}