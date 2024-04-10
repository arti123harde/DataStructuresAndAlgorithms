package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class ConstructSmallestNumberFromDIString {

    public static void main(String[] args) {
        System.out.println(smallestNumber("IIIDIDDD"));
        System.out.println(smallestNumber("III"));
        System.out.println(smallestNumber("DDD"));
    }

    public static String smallestNumber(String pattern) {
        StringBuilder stringBuilder = new StringBuilder("123456789".substring(0,pattern.length()+1));
        for(int i=0; i<pattern.length(); i++){
            if(pattern.charAt(i) == 'D'){
                int index = pattern.indexOf("I", i);
                if(index != -1){
                    String s1 = stringBuilder.substring(i, i+1);
                    String s2 = new StringBuilder(stringBuilder.substring(i+1, index+1)).reverse().toString();
                    stringBuilder.replace(i, index+1, s2 + s1);
                    i = index;
                }else{
                    String s1 = new StringBuilder(stringBuilder.substring(i)).reverse().toString();
                    stringBuilder.replace(i, stringBuilder.length(), s1);
                    i = i + s1.length();
                }
            }
        }
        return stringBuilder.toString();
    }
}