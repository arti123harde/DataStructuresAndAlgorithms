package org.solutions.string;

public class CountWordsWithPrefix {

    public static void main(String[] args) {
        System.out.println(prefixCount(new String[]{"pay","attention","practice","attend"}, "at"));
        System.out.println(prefixCount(new String[]{"leetcode","win","loops","success"}, "code"));
    }

    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String w : words){
            if(w.startsWith(pref)){
                count ++;
            }
        }
        return count;
    }
}
