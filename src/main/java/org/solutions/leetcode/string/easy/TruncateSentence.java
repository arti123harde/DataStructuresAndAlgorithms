package org.solutions.leetcode.string.easy;

public class TruncateSentence {

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
        System.out.println(truncateSentence("What is the solution to this problem", 4));
        System.out.println(truncateSentence("chopper is not a tanuki", 5));
    }

    public static String truncateSentence(String s, int k) {
        int c = 0;
        String str = "";
        for (String s1 : s.split(" ")){
            if(c < k){
                str = str + " " + s1;
                c++;
            }else {
                break;
            }
        }
        return str.trim();
    }

}
