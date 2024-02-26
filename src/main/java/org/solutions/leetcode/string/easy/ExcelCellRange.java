package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

public class ExcelCellRange {

    public static void main(String[] args) {
        //<col1><row1>:<col2><row2>
        System.out.println(cellsInRange("K1:L2")); //["K1","K2","L1","L2"]
        System.out.println(cellsInRange("A1:F1")); //["A1","B1","C1","D1","E1","F1"]
        System.out.println(cellsInRange("A1:F3"));
    }

    public static List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        char startColumn = s.charAt(0);
        char endColumn = s.charAt(3);
        while (startColumn <= endColumn){
            int startRow = Integer.parseInt(String.valueOf(s.charAt(1)));
            int endRow = Integer.parseInt(String.valueOf(s.charAt(4)));
            for(int i=startRow; i<=endRow; i++){
                    list.add(String.valueOf(startColumn) + i);
            }
            startColumn = (char)(startColumn + 1);
        }
        return list;
    }
}
