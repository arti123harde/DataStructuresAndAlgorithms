package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class PrefixWord {

    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));
        System.out.println(isPrefixOfWord("this problem is an easy problem", "pro"));
        System.out.println(isPrefixOfWord("this problem is an easy problem", "you"));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] splits = sentence.split(" ");
        for(int i=0; i<splits.length; i++){
            if(splits[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }

}