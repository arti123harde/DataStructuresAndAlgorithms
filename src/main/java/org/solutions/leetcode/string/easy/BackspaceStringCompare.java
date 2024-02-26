package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("a##c", "#a#c"));
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a#c", "b"));
    }

    public static boolean backspaceCompare(String s, String t) {
        String s1 = "";
        String s2 = "";
        s1 = getString(s);
        s2 = getString(t);
        return s1.equals(s2);
    }

    private static String getString(String str){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != '#'){
                stringBuilder.append(str.charAt(i));
            }else{
                if(stringBuilder.length() > 0){
                    stringBuilder = new StringBuilder(stringBuilder.substring(0, stringBuilder.length() - 1));
                }
            }
        }
        return stringBuilder.toString();
    }
}