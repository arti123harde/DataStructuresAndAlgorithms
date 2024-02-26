package org.solutions.leetcode.string.easy;

public class DecryptString {

    public static void main(String[] args) {
        System.out.println(freqAlphabets("10#11#12"));
        System.out.println(freqAlphabets("1326#"));
    }

    public static String freqAlphabets(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int i=0;
        char c;
        while(i<s.length()){
            if((i+2)<s.length() && s.charAt(i+2)=='#'){
                c = (char)(Integer.parseInt(s.substring(i, i+2)) + 96);
                i = i+3;
            }else{
                c = (char)(Integer.parseInt(s.substring(i, i+1)) + 96);
                i++;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
