package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class CountPrefixSuffixPairsI {

    public static void main(String[] args) {
        System.out.println(countPrefixSuffixPairs(new String[]{"a","aba","ababa","aa"}));
        System.out.println(countPrefixSuffixPairs(new String[]{"pa","papa","ma","mama"}));
        System.out.println(countPrefixSuffixPairs(new String[]{"abab","ab"}));
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i=0; i< words.length-1; i++){
            for(int j=i+1; j< words.length; j++){
                if(words[j].startsWith(words[i]) && words[j].endsWith(words[i])){
                    count++;
                }
            }
        }
        return count;
    }
}