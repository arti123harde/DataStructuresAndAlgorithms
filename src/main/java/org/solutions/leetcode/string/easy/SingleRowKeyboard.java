package org.solutions.leetcode.string.easy;

public class SingleRowKeyboard {

    public static void main(String[] args) {
        System.out.println(calculateTime("abcdefghijklmnopqrstuvwxyz", "cba"));
        System.out.println(calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
    }

    public static int calculateTime(String keyboard, String word) {
        int count = 0;
        int begin = 0;
        int end;
        for(int i=0; i<word.length(); i++){
            end = keyboard.indexOf(word.charAt(i));
            count = count + (begin>end ? begin-end : end-begin);
            begin = end;
        }
        return count;
    }
}

