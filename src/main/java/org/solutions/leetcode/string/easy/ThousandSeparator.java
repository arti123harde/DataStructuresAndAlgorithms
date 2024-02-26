package org.solutions.leetcode.string.easy;

import java.util.Objects;

/**
 * @author Arti Harde
 */
public class ThousandSeparator {

    public static void main(String[] args) {
        System.out.println(thousandSeparator(51040));
        System.out.println(thousandSeparator(987));
        System.out.println(thousandSeparator(1234));
    }

    public static String thousandSeparator(int n) {
        StringBuilder s = new StringBuilder();
        String s1 = String.valueOf(n);
        if(s1.length() < 3){
            s.append(s1);
        }else{
            int index = s1.length();
            while(index > 3){
                s.insert(0, s1.substring(index-3, index)).insert(0,".");
                index = index - 3;
            }
            s.insert(0, s1.substring(0, index));
        }
        return s.toString();
    }

    public static String thousandSeparator2(int n) {
        StringBuilder s = new StringBuilder();
        if(n==0){
            s.append(n);
        }else{
            while (n != 0){
                int mod = n % 1000;
                n = n / 1000;
                if(s.length() == 0){
                    s.insert(0, mod);
                }else{
                    s.insert(0,".").insert(0, mod);
                }
            }
        }
        return s.toString();
    }

    public static String thousandSeparator1(int n) {
        String s = null;
        while (n != 0){
            int mod = n % 1000;
            n = n / 1000;
            if(Objects.isNull(s)){
                s = String.valueOf(mod);
            }else{
                s = mod + "." + s;
            }
        }
        return s;
    }
}