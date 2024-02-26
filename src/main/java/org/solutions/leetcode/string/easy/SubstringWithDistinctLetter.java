package org.solutions.leetcode.string.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubstringWithDistinctLetter {

    public static void main(String[] args) {
        System.out.println(countLetters2("aaaba"));
        System.out.println(countLetters2("aaaaaaaaaa"));
    }

    public static int countLetters1(String s) {
        int count = 0;
        for(int i=0; i<=s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String s1 = s.substring(i, j);
                Set<String> stringSet = new HashSet<>(Arrays.asList(s1.split("")));
                if(stringSet.size() == 1){
                    count ++;
                }
            }
        }
        return count;
    }

    public static int countLetters2(String s) {
        int count = 0;
        int i=0;
        int j=0;
        int len=0;
        while(i<s.length()){
            j = getNextIndex(i, s.charAt(j),  s);
            len = j- i;
            count = count + (len * (len+1))/2;
            i = j;
        }
        return count;
    }

    public static int getNextIndex(int i, char c, String s){
        while(i<s.length() && s.charAt(i) == c){
            i++;
        }
        return i ;
    }



    public static int countLetters(String S) {
        int res = 1;
        int count = 1;
        for(int i=1; i<S.length(); i++){
            if(S.charAt(i) == S.charAt(i-1))
                count++;
            else
                count = 1;
            res += count;
        }
        return res;
    }
}
