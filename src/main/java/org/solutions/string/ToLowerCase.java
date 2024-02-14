package org.solutions.string;

public class ToLowerCase {

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));
        System.out.println(toLowerCase("al&phaBET"));
    }

    public static String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for (Character s1 : s.toCharArray()){
            if(s1 >= 65 && s1 <=90){
                str.append((char)(s1+32));
            }else{
                str.append(s1);
            }
        }
        return str.toString();
    }

}
