package org.solutions.leetcode.string.easy;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
        System.out.println(removeDuplicates("aaaaaa"));
        System.out.println(removeDuplicates("azxxzy"));
    }

    public static String removeDuplicates1(String s) {
        boolean isDuplicate = true;
        while (isDuplicate){
            boolean temp = false;
            for(int i=0; i<s.length()-1; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    temp = true;
                    s = s.substring(0,i) + s.substring(i+2);
                    break;
                }
            }
            isDuplicate = temp;
        }
        return s;
    }

    public static String removeDuplicates(String s){
        char[] chars = new char[s.length()];
        int index = 0;
        for(int i=0; i<s.length(); i++){
            if(index!=0 && (chars[index-1] == s.charAt(i))){
                index--;
            }else{
                chars[index] = s.charAt(i);
                index++;
            }
        }
        return new String(chars, 0, index);
    }
}
