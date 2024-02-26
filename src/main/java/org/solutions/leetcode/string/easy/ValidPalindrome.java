package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("a."));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
        System.out.println(isPalindrome(".,"));
    }

    public static boolean isPalindrome(String s) {
        boolean result = true;
        if(s.length() == 1){
            result = true;
        }else{
            s = s.toLowerCase();
            int i = 0;
            int j = s.length()-1;
            while (i <= j){
                boolean a = isCharacter(s.charAt(i));
                boolean b = isCharacter(s.charAt(j));
                if(a && b){
                    if(s.charAt(i) == s.charAt(j)){
                        result = true;
                        i++;
                        j--;
                    }else {
                        result = false;
                        break;
                    }
                }
                if(!a){
                    i++;
                }
                if(!b){
                    j--;
                }
            }
        }
        return result;
    }

    public static boolean isCharacter(char ch){
        return (64 < ch && ch < 91) || (96 < ch && ch < 123) || (47 < ch && ch < 58);
    }
}