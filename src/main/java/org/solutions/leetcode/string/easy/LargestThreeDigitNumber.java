package org.solutions.leetcode.string.easy;

public class LargestThreeDigitNumber {

    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
        System.out.println(largestGoodInteger("2300019"));
        System.out.println(largestGoodInteger("42352338"));
    }

    public static String largestGoodInteger(String num) {
        char c = '/';
        for(int i=0; i<num.length()-2; i++){
            if((num.charAt(i) == num.charAt(i+1)) && (num.charAt(i+1) == num.charAt(i+2))){
                if(c < num.charAt(i)){
                    c = num.charAt(i);
                }
            }
        }
        if(c == '/'){
            return "";
        }else{
            return String.valueOf(c).repeat(3);
        }
    }
}
