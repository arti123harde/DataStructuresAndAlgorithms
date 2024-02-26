package org.solutions.leetcode.string.easy;

public class CheckNumberHasEqualDigitCountAndValue {

    public static void main(String[] args) {
        System.out.println(digitCount("1210"));
        System.out.println(digitCount("030"));
    }

    public static boolean digitCount(String num) {
        for(int i=0; i<num.length(); i++){
            char j = (char) (i + 48);
            int c1 = Integer.parseInt(String.valueOf(num.charAt(i)));
            int c2 = (int) num.chars().filter(c -> c == j).count();
            if(c2 != c1){
                return false;
            }
        }
        return true;
    }
}
