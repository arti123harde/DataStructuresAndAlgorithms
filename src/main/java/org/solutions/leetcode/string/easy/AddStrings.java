package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class AddStrings {

    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
        System.out.println(addStrings("456", "77"));
        System.out.println(addStrings("0", "0"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        int carry = 0;
        int length = Math.max(num1.length(), num2.length());
        while (index < length){
            int sum = 0;
            if(index < num1.length()){
                sum = sum + (num1.charAt(num1.length() - 1 - index) - '0');
            }
            if(index < num2.length()){
                sum = sum + (num2.charAt(num2.length() - 1- index) - '0');
            }
            sum = sum + carry;
            if(sum >= 10){
                carry = sum / 10;
                stringBuilder.insert(0, sum % 10);
            }else {
                carry = 0;
                stringBuilder.insert(0, sum);
            }
            index++;
        }
        if(carry != 0){
            stringBuilder.insert(0, carry);
        }
        return stringBuilder.toString();
    }

}