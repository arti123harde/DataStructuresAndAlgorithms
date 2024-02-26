package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class SumOfDigitsOfStringAfterConvert {

    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
        System.out.println(getLucky("iiii", 1));
        System.out.println(getLucky("zbax", 2));
    }

    public static int getLucky(String s, int k) {
        s = convert(s);
        while (k > 0){
            s = transform(s);
            k--;
        }
        return Integer.parseInt(s);
    }

    public static String convert(String s){
        StringBuilder s1 = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            s1.append(s.charAt(i) - 96);
        }
        return s1.toString();
    }

    public static String transform(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return String.valueOf(sum);
    }
}