package org.solutions.leetcode.string.easy;

import java.lang.module.FindException;

/**
 * @author Arti Harde
 */
public class ReformatPhoneNumber {

    public static void main(String[] args) {
        System.out.println(reformatNumber("1-23-45 6"));
        System.out.println(reformatNumber("123 4-567"));
        System.out.println(reformatNumber("123 4-5678"));
        System.out.println(reformatNumber("123 4-5678 - 45678"));
    }

    public static String reformatNumber(String number) {
        String s = "";
        int index = 0;
        number = number.replace("-", "").replace(" ", "");
        while (index < number.length()){
            if(number.substring(index).length() == 4){
                s = s + number.substring(index, index+2) + "-" + number.substring(index+2, index+4);
                break;
            }else if(number.substring(index).length() == 5){
                s = s + number.substring(index, index+3) + "-" + number.substring(index+3, index+5);
                break;
            }else if(number.substring(index).length() >= 3){
                s = s + number.substring(index, index+3);
                if(index + 3 < number.length()){
                    s += "-";
                    index = index + 3;
                }else {
                    break;
                }
            }else{
                s = number;
                break;
            }
        }
        return s;
    }
}