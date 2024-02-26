package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class DecomposableIntoValueEqualSubstrings {

    public static void main(String[] args) {
        System.out.println(isDecomposable("66666666666677722"));
        System.out.println(isDecomposable("000111000"));
        System.out.println(isDecomposable("00011111222"));
        System.out.println(isDecomposable("011100022233"));
    }

    public static boolean isDecomposable(String s) {
        boolean subStringOfLenTwo = false;
        boolean isValidString = false;
        int index = 0;
        while (index < s.length()){
            if(index+1<s.length() && index+2<s.length() && s.charAt(index) == s.charAt(index+1) && s.charAt(index+1) == s.charAt(index+2)){
                isValidString = true;
                index = index + 3;
            }else if(index+1<s.length() && s.charAt(index) == s.charAt(index+1) && !subStringOfLenTwo){
                isValidString = true;
                subStringOfLenTwo = true;
                index = index + 2;
            }else {
                isValidString = false;
                break;
            }
        }
        return isValidString && subStringOfLenTwo;
    }
}