package org.solutions.string;

public class AscendingNumberSentence {

    public static void main(String[] args) {
        System.out.println(areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
        System.out.println(areNumbersAscending("hello world 5 x 5"));
        System.out.println(areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
    }

    public static boolean areNumbersAscending(String s) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            String s1 = "";
            if(s.charAt(i) < 58 && s.charAt(i) > 47){
                s1 = String.valueOf(s.charAt(i));
                if((i+1) < s.length() && s.charAt(i+1) < 58 && s.charAt(i+1) > 47){
                    s1 = s1 + s.charAt(i + 1);
                    i++;
                }
                if(Integer.parseInt(s1) <= max){
                    return false;
                }else{
                    max = Integer.parseInt(s1);
                }
            }
        }
        return true;
    }
}
