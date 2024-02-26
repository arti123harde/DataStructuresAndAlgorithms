package org.solutions.leetcode.string.easy;

public class SeniorCitizens {

    public static void main(String[] args) {
        System.out.println(countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
        System.out.println(countSeniors(new String[]{"1313579440F2036","2921522980M5644"}));
    }

    public static int countSeniors(String[] details) {
        int count = 0;
        for(String citizen : details){
            if(Integer.parseInt(citizen.substring(11,13)) > 60){
                count ++;
            }
        }
        return count;
    }
}
