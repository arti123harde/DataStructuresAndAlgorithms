package org.solutions.leetcode.string.easy;

public class OddCountCharString {

    public static void main(String[] args) {
        System.out.println(generateTheString(77));
        System.out.println(generateTheString(70));
        System.out.println(generateTheString(78));
        System.out.println(generateTheString(4));
        System.out.println(generateTheString(2));
    }

    public static String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int a = n%2 == 0 ? n-1 : n;
        int b = n - a;
        for(int i=0; i<a; i++){
            stringBuilder.append('a');
        }
        for(int i=0; i<b; i++){
            stringBuilder.append('b');
        }
        return stringBuilder.toString();
    }
}
