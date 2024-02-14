package org.solutions.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Objects;

public class ValidInteger {

    public static void main(String[] args) {
//        System.out.println(validInteger("-123e.456e789"));
//        System.out.println(validInteger("343e43."));
//        System.out.println(validInteger("53.5e93"));
//        System.out.println(validInteger("99e2.5"));
//        System.out.println(validInteger("."));
//        System.out.println(validInteger("inf"));
        System.out.println(validInteger("0.."));
    }

    public static boolean validInteger(String s){
        boolean result = false;
        boolean num = false;
        boolean sign = false;
        boolean decimal = false;
        boolean exp = false;
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '+' || c == '-'){
                if(num || decimal || sign){
                    result = false;
                    break;
                }else{
                    result = true;
                    sign = true;
                }
            }else if((c == 'E' || c=='e')){
                if(!num || exp){
                    result = false;
                    break;
                }else {
                    exp = true;
                    sign = false;
                    num = false;
                    decimal = false;
                    result = true;
                }
            }else if(c == '.'){
                if(exp || decimal){
                    result = false;
                    break;
                }else {
                    result = true;
                    decimal = true;
                }
            }else if(c >='0' && c<='9'){
                result = true;
                num = true;
            }else {
                result = false;
                break;
            }
        }
        return result && num;
    }
}
