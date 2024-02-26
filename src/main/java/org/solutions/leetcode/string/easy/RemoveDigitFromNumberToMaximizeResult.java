package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class RemoveDigitFromNumberToMaximizeResult {

    public static void main(String[] args) {
        System.out.println(removeDigit("123", '3'));
        System.out.println(removeDigit( "1231", '1'));
        System.out.println(removeDigit( "551", '5'));
        System.out.println(removeDigit("2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471",
                '3'));
    }

    public static String removeDigit(String number, char digit) {
        String s = "";
        for(int i = 0; i<number.length(); i++){
            if(number.charAt(i) == digit){
                String temp = number.substring(0, i);
                if(i + 1< number.length()){
                    temp = temp +  number.substring(i+1);
                }
                if(temp.compareTo(s) > 0){
                    s = temp;
                }
            }
        }
        return s;
    }
}