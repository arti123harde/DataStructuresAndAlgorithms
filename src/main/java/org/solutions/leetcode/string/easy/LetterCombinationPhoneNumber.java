package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNumber {

    private static Map<String, List<String>> data = new HashMap<>();

    private static int iteration = 0;

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        int l = digits.length();
        if(l == 0){
            return result;
        }else if(l == 1){
            result = data.get(digits);
            return result;
        }else {
//            for(int i=0; i < l; i++){
//                for(String s1 : data.get(String.valueOf(digits.charAt(i)))){
//                    String r = s1;
//                    for(int j=i+1; j < l; j++){
//                        for(String s2 : data.get(String.valueOf(digits.charAt(j)))){
//                            String r1 = r + s2;
//                            for(int k=j+1; k < l; k++){
//                                for(String s3 : data.get(String.valueOf(digits.charAt(k)))){
//                                    String r2 = r1 + s3;
//                                    for(int m=k+1; m < l; m++){
//                                        for(String s4 : data.get(String.valueOf(digits.charAt(m)))){
//                                            String r4 = r2 + s4;
//                                            result.add(r4);
//                                        }
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//            }
            getLetterCombination(0, 0, l, digits, "", result);
            return result;
        }
    }
    public static void getLetterCombination(int counter, int index, int length, String inputString , String resultString, List<String> result){
        System.out.println("index  : " + index + " Length  : " + iteration + " Counter  : " + iteration);
        if(index == length){
            result.add(resultString);
            for(int i=1; i< data.get(String.valueOf(inputString.charAt(index-1))).size(); i++){
                String s1 = resultString.substring(0, resultString.length()-1);
                s1 = s1 + data.get(String.valueOf(inputString.charAt(index-1))).get(i);
                result.add(s1);
            }
            counter++;
            if(counter < data.get(String.valueOf(inputString.charAt(0))).size()){
                index = counter;
                length = inputString.length() - counter;
            }
        }
        if(index < length){
            resultString = resultString + data.get(String.valueOf(inputString.charAt(index))).get(0);
            index++;
            getLetterCombination(counter, index, length, inputString, resultString, result);
        }
    }

    static {
        data.put("2", Arrays.asList("a", "b", "c"));
        data.put("3", Arrays.asList("d", "e", "f"));
        data.put("4", Arrays.asList("g", "h", "i"));
        data.put("5", Arrays.asList("j", "k", "l"));
        data.put("6", Arrays.asList("m", "n", "o"));
        data.put("7", Arrays.asList("p", "q", "r", "s"));
        data.put("8", Arrays.asList("t", "u", "v"));
        data.put("9", Arrays.asList("w", "x", "y", "z"));
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("2345"));
    }



}