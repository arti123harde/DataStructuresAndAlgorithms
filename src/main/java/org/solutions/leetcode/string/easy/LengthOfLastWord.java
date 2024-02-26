package org.solutions.leetcode.string.easy;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord1("day"));
//        System.out.println(lengthOfLastWord1("Hello World"));
//        System.out.println(lengthOfLastWord1("   fly me   to   the moon  "));
//        System.out.println(lengthOfLastWord1("luffy is still joyboy"));
    }

    private static int lengthOfLastWord(String s){
        int l = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(!Character.isWhitespace(s.charAt(i))){
                count++;
                l = count;
            }else{
                count = 0;
            }
        }
        return l;
    }

    private static int lengthOfLastWord1(String s){
        int l = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(!Character.isWhitespace(s.charAt(i))){
                l++;
                if((i-1)<0 || Character.isWhitespace(s.charAt(i-1))){
                    break;
                }
            }
        }
        return l;
    }
}
