package org.solutions.string;

public class RemoveTailingZeros {

    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("51230100"));
        System.out.println(removeTrailingZeros("123"));
    }

    public static String removeTrailingZeros(String num) {
        String s = "";
        int c = num.length()-1;
        while (c>=0 && num.charAt(c)=='0'){
            c--;
        }
        return num.substring(0,c+1);
    }
}
