package org.solutions.leetcode.string.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class VowelSubstrings {

    public static void main(String[] args) {
        System.out.println(countVowelSubstrings("aeiouu"));
        System.out.println(countVowelSubstrings("unicornarihan"));
        System.out.println(countVowelSubstrings("cuaieuouac"));
    }

    public static int countVowelSubstrings(String word) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for(int i=0; i<word.length(); i++){
            Set<Character> set1 = new HashSet<>();
            for(int j=i; j<word.length(); j++){
                if(set.contains(word.charAt(j))){
                    set1.add(word.charAt(j));
                    if(set1.size() >= 5){
                        count++;
                    }
                }else {
                    break;
                }
            }
        }
        return count;
    }
}