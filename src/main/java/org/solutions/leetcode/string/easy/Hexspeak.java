package org.solutions.leetcode.string.easy;

import java.util.Objects;

/**
 * @author Arti Harde
 */
public class Hexspeak {

    public static void main(String[] args) {
        System.out.println(toHexspeak("257"));
        System.out.println(toHexspeak("747823223228"));
        System.out.println(toHexspeak("619879596177"));
        System.out.println(toHexspeak("3"));
    }

    public static String toHexspeak(String num) {
        String result = "";
        String[] hexStrings = {"O", "I", "ERROR", "ERROR", "ERROR", "ERROR", "ERROR", "ERROR", "ERROR", "ERROR",
                "A", "B", "C", "D", "E", "F" };
        while (!Objects.equals(num, "")){
            long div = Long.parseLong(num) / 16;
            long mod = Long.parseLong(num) % 16;
            if(!hexStrings[(int)mod].equals("ERROR")){
                num = String.valueOf(div);
                result = hexStrings[(int)mod] + result;
            }else{
                return "ERROR";
            }
            if(div == 0){
                num = "";
            }
        }
        return result;
    }
}