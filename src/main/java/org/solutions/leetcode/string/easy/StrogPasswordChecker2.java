package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class StrogPasswordChecker2 {

    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("a1A!A!A!"));
        System.out.println(strongPasswordCheckerII("IloveLe3tcode!"));
        System.out.println(strongPasswordCheckerII("Me+You--IsMyDream"));
        System.out.println(strongPasswordCheckerII("1aB!"));
    }

    public static boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8){
            return false;
        }
        String specialChars = "!@#$%^&*()-+";
        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isDigit = false;
        boolean isSpecialChar = false;
        for(int i=0; i<password.length(); i++){
            if(i>0 && password.charAt(i) == password.charAt(i-1)){
                return false;
            }
            if(specialChars.contains(String.valueOf(password.charAt(i)))){
                isSpecialChar = true;
            }else if(Character.isDigit(password.charAt(i))){
                isDigit = true;
            }else if(Character.isUpperCase(password.charAt(i))){
                isUpperCase = true;
            }else if(Character.isLowerCase(password.charAt(i))){
                isLowerCase = true;
            }
        }
        return isLowerCase && isUpperCase && isDigit && isSpecialChar;
    }
}