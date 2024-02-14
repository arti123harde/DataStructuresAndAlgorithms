package org.solutions.string;

public class EqualWordSummation {

    public static void main(String[] args) {
        System.out.println(isSumEqual("acb", "cba", "cdb"));
        System.out.println(isSumEqual("aaa", "a", "aab"));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int d1 = getNumber(firstWord);
        int d2 = getNumber(secondWord);
        int d3 = getNumber(targetWord);
        return d1 + d2 == d3;
    }

    private static int getNumber(String s){
        int num = 0;
        for(int i=s.length()-1; i>=0; i--){
            num = num + (s.charAt(i) - 'a') * (int)Math.pow(10, s.length()-1-i);
        }
        return num;
    }
}
