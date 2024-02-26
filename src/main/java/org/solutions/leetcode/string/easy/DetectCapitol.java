package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class DetectCapitol {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
    }

    public static boolean detectCapitalUse(String word) {
        boolean isCapital = Character.isUpperCase(word.charAt(0));
        if(isCapital){
            for(int i=1; i<word.length()-1; i++){
                if(Character.isLowerCase(word.charAt(i)) && Character.isUpperCase(word.charAt(i+1))
                    || Character.isUpperCase(word.charAt(i)) && Character.isLowerCase(word.charAt(i+1))){
                    return false;
                }
            }
        }else{
            for(char c : word.toCharArray()){
                if(Character.isUpperCase(c)){
                    return false;
                }
            }
        }
        return true;
    }
}