package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class SubstringOfWordsConcatenation {

    /**
     * You are given a string s and an array of strings words. All the strings of words are of the same length.
     * <p>
     * A concatenated substring in s is a substring that contains all the strings of any permutation of words concatenated.
     * <p>
     * For example, if words = ["ab","cd","ef"], then "abcdef", "abefcd", "cdabef", "cdefab", "efabcd",
     * and "efcdab" are all concatenated strings.
     * "acdbef" is not a concatenated substring because it is not the concatenation of any permutation of words.
     * <p>
     * Return the starting indices of all the concatenated substrings in s. You can return the answer in any order.
     * <p>
     * Example 1:
     * Input: s = "barfoothefoobarman", words = ["foo","bar"]
     * Output: [0,9]
     * <p>
     * Example 2:
     * Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
     * Output: []
     */
    public static void main(String[] args) {
        System.out.println(findSubStringIndexes("barfoothefoobarman", new String[]{"foo","bar"}));
        System.out.println(findSubStringIndexes("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));;
        System.out.println(findSubStringIndexes("barfoofoobarthefoobarman", new String[]{"foo","bar", "the"}));;
    }

    private static List<Integer> findSubStringIndexes(String s, String[] words){
        List<Integer> indexes = new ArrayList<>();
        HashMap<String, Integer> hashtable = populateHashTable(words);
        int n = words.length;
        int l1 = words[0].length();
        int l2 = words.length * l1;
        for(int i=0; i<(s.length()-l2)+1; i++){
            HashMap<String, Integer> hashtable1 = new HashMap<>(hashtable);
            if(validateSubstring(s.substring(i, i+l2), hashtable1, l1, n)){
                indexes.add(i);
            }
        }
        return indexes;
    }

    private static HashMap<String, Integer> populateHashTable(String[] words){
        HashMap<String, Integer> hashtable = new HashMap<>();
        for (String str : words){
            int count = 1;
            if(hashtable.containsKey(str)){
                count = hashtable.get(str) + 1;
            }
            hashtable.put(str, count);
        }
        return hashtable;
    }

    private static boolean validateSubstring(String subString, HashMap<String, Integer> hashtable, int l1, int n){
        int counter = 1;
        int begin = 0;
        int end = l1;
        while (counter <= n){
            String s = subString.substring(begin, end);
            if(hashtable.containsKey(s)){
                begin = end;
                end = end + l1;
                counter++;
                int c = hashtable.get(s);
                hashtable.put(s,--c);
            }else{
                break;
            }
        }
        return hashtable.entrySet().stream().noneMatch(ht-> ht.getValue() != 0);
    }
}
