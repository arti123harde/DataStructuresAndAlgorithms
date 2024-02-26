package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        System.out.println(convertToTitle(27));
        System.out.println(convertToTitle(52));
        System.out.println(convertToTitle(702));
        System.out.println(convertToTitle(26));
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(2147483647));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {
        if(columnNumber <= 26){
            return String.valueOf((char)(columnNumber + 64));
        }else {
            StringBuilder stringBuilder = new StringBuilder();
            int mod = 0;
            while (columnNumber > 26){
                mod = columnNumber % 26;
                if(mod > 0){
                    stringBuilder.insert(0, (char)(mod + 64));
                    columnNumber = columnNumber / 26;
                }else {
                    stringBuilder.insert(0, 'Z');
                    columnNumber = columnNumber / 26;
                    columnNumber--;
                }
            }
            stringBuilder.insert(0, (char)(columnNumber + 64));
            return stringBuilder.toString();
        }
    }
}