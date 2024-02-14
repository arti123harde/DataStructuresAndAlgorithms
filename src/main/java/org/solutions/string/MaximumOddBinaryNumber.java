package org.solutions.string;

public class MaximumOddBinaryNumber {

    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("010"));
        System.out.println(maximumOddBinaryNumber("0101"));
        System.out.println(maximumOddBinaryNumber("01000110"));
    }

    public static String maximumOddBinaryNumber(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int ones = (int)s.chars().filter(c -> c=='1').count();
        int zeros = (int)s.chars().filter(c -> c=='0').count();
        stringBuilder.append("1".repeat(ones - 1));
        stringBuilder.append("0".repeat(zeros));
        return stringBuilder.append('1').toString();
    }
}
