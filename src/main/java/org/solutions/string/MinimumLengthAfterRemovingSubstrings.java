package org.solutions.string;

public class MinimumLengthAfterRemovingSubstrings {

    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
        System.out.println(minLength("ACBBD"));
    }

    public static int minLength(String s) {
        boolean temp = true;
        while (temp){
            if(s.contains("AB")){
                s = s.replace("AB", "");
            }else if(s.contains("CD")){
                s = s.replace("CD", "");
            }else{
                temp = false;
            }
        }
        return s.length();
    }
}
