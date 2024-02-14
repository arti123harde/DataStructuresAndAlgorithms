package org.solutions.string;

public class MaximumValueOfStringInArray {

    public static void main(String[] args) {
        System.out.println(maximumValue(new String[]{"alic3","bob","3","4","00000"}));
        System.out.println(maximumValue(new String[]{"1","01","001","0001"}));
    }

    public static int maximumValue(String[] strs) {
        int max = 0;
        for(String s : strs){
            if(s.chars().filter(c -> c>96 && c<123).count() > 0){
                max = Math.max(max, s.length());
            }else{
                s = s.replaceFirst("^[0]*", "");
                max = Math.max(max, !s.equals("") ? Integer.parseInt(s) : 0);
            }
        }
        return max;
    }
}
