package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class LongerContiguousSegmentsOfOnesThanZeros {

    public static void main(String[] args) {
        System.out.println(checkZeroOnes("1101"));
        System.out.println(checkZeroOnes("111000"));
        System.out.println(checkZeroOnes("110100010"));
    }

    public static boolean checkZeroOnes(String s) {
        boolean result = false;
        int count1 = 0;
        int count0 = 0;
        while(s.length() > 0){
            if(s.charAt(0) == '0'){
                if(s.indexOf('1') != -1){
                    count0 = Math.max(s.substring(0, s.indexOf('1')).length(), count0);
                    s = s.substring(s.indexOf('1'));
                }else{
                    count0 = Math.max(s.length(), count0);
                    s = "";
                }
            }else if(s.charAt(0) == '1'){
                if(s.indexOf('0') != -1){
                    count1 = Math.max(s.substring(0, s.indexOf('0')).length(), count1);
                    s = s.substring(s.indexOf('0'));
                }else{
                    count1 = Math.max(s.length(), count1);
                    s = "";
                }
            }
            result = count0 < count1;
        }
        return result;
    }
}