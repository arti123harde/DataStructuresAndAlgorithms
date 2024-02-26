package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class BuddyString {

    public static void main(String[] args) {
        System.out.println(buddyStrings("abc", "acd"));
        System.out.println(buddyStrings("acccccb", "bccccca"));
        System.out.println(buddyStrings("acccccb", "bccccca"));
        System.out.println(buddyStrings("abab", "abab"));
        System.out.println(buddyStrings("abcd", "cbad"));
        System.out.println(buddyStrings("ab", "ba"));
        System.out.println(buddyStrings("ab", "ab"));
        System.out.println(buddyStrings("aa", "aa"));
    }

    public static boolean buddyStrings(String s, String goal) {
        if(s.length() == 1){
            return false;
        }else if(s.length() == 2){
            return new StringBuilder(s).reverse().toString().equals(goal);
        }else if(s.equals(goal)){
            for(int i=0; i<s.length(); i++){
                if(i != s.lastIndexOf(s.charAt(i))){
                    return true;
                }
            }
            return false;
        }else {
            int i = 0;
            int j = s.length() - 1;
            while (i < j){
                if(s.charAt(i) == goal.charAt(i)){
                    i++;
                }else {
                    int index = s.indexOf(goal.charAt(i));
                    if(index != -1){
                        char[] chars = s.toCharArray();
                        char temp = chars[index];
                        chars[index] = s.charAt(i);
                        chars[i] = temp;
                        if(new String(chars).equals(goal)){
                            return true;
                        }else {
                            i++;
                        }
                    }else {
                        return false;
                    }
                }
                if(s.charAt(j) == goal.charAt(j)){
                    j--;
                }else{
                    int index = s.indexOf(goal.charAt(j));
                    if(index != -1){
                        char[] chars = s.toCharArray();
                        char temp = chars[index];
                        chars[index] = s.charAt(j);
                        chars[j] = temp;
                        if(new String(chars).equals(goal)){
                            return true;
                        }else {
                            j--;
                        }
                    }else {
                        return false;
                    }
                }
            }
            return false;
        }
    }
}