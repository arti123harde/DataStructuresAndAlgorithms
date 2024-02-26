package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class CalculateDigitSumOfString {

    public static void main(String[] args) {
        System.out.println(digitSum("11111222223", 3));
        System.out.println(digitSum("00000000", 3));
    }

    public static String digitSum(String s, int k) {
        while (s.length() > k){
            StringBuilder s1 = new StringBuilder();
            for(int i=0; i<s.length(); i=i+k){
                String[] split = null;
                if(i+k > s.length()){
                    split = s.substring(i).split("");
                }else{
                    split = s.substring(i, i+k).split("");
                }
                int sum = 0;
                for(String s2 : split){
                    sum += Integer.parseInt(s2);
                }
                s1.append(sum);
            }
            s = s1.toString();
        }
        return s;
    }
}