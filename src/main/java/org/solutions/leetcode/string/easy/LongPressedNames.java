package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class LongPressedNames {

    public static void main(String[] args) {
        System.out.println(isLongPressedName("leelee", "lleeelee"));
        System.out.println(isLongPressedName("alex", "aaleex"));
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
    }

    public static boolean isLongPressedName(String name, String typed) {
        boolean result = false;
        int index1 = 0;
        int index2 = 0;
        while (index1 < name.length() && index2 < typed.length()){
            char c = name.charAt(index1);
            if(typed.charAt(index2) == c){
                int c1 = 0;
                int c2 = 0;
                while (index1 < name.length() && c == name.charAt(index1)){
                    index1++;
                    c1++;
                }
                while (index2 < typed.length() && c == typed.charAt(index2)){
                    index2++;
                    c2++;
                }
                if(c2 > c1 || c2 == c1){
                    result = true;
                }else {
                    result = false;
                    break;
                }
            }else {
                result = false;
                break;
            }
        }
        return result && index1 == name.length() && index2 == typed.length();
    }
}