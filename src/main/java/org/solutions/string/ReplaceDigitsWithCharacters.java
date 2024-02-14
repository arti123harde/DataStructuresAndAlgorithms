package org.solutions.string;

public class ReplaceDigitsWithCharacters {

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
        System.out.println(replaceDigits( "a1b2c3d4e"));
    }

    public static String replaceDigits(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i=0; i<s.length(); i=i+2){
            s1.append(s.charAt(i));
            if(i+1 != s.length()){
                s1.append((char)(s.charAt(i) + (s.charAt(i + 1) - '0')));
            }
        }
        return s1.toString();
    }
}
