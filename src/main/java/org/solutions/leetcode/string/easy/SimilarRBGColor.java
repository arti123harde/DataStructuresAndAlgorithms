package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.Map;

public class SimilarRBGColor {

    public static void main(String[] args) {
        System.out.println(similarRGB("#09f166"));
        System.out.println(similarRGB("#4e3fe1"));
    }

    public static String similarRGB(String color) {
        Map<String, Integer> hexMap = new HashMap<>();
        hexMap.put("00",calculateValue(0));
        hexMap.put("11",calculateValue(1));
        hexMap.put("22",calculateValue(2));
        hexMap.put("33",calculateValue(3));
        hexMap.put("44",calculateValue(4));
        hexMap.put("55",calculateValue(5));
        hexMap.put("66",calculateValue(6));
        hexMap.put("77",calculateValue(7));
        hexMap.put("88",calculateValue(8));
        hexMap.put("99",calculateValue(9));
        hexMap.put("aa",calculateValue(10));
        hexMap.put("bb",calculateValue(11));
        hexMap.put("cc",calculateValue(12));
        hexMap.put("dd",calculateValue(13));
        hexMap.put("ee",calculateValue(14));
        hexMap.put("ff",calculateValue(15));

        StringBuilder result = new StringBuilder("#");
        for(int i=1; i<color.length(); i+=2){
            int min = Integer.MAX_VALUE;
            String key = "";
            int colorValue = Integer.parseInt(color.substring(i, i+2), 16);
            for(Map.Entry<String, Integer> entry : hexMap.entrySet()){
                int diff = Math.abs(entry.getValue()-colorValue);
                if(diff < min){
                    min = diff;
                    key = entry.getKey();
                }
            }
            result.append(key);
        }
        return result.toString();
    }

    private static int calculateValue(int v){
        return v*16 + v;
    }
}
