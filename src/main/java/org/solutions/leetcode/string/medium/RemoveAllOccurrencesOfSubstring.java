package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class RemoveAllOccurrencesOfSubstring {

    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
        System.out.println(removeOccurrences("axxxxyyyyb", "xy"));
    }

    public static String removeOccurrences(String s, String part) {
        boolean p = true;
        while (p){
            if(s.contains(part)){
                int begin = s.indexOf(part);
                s = s.substring(0, begin) + s.substring(begin + part.length());
            }else {
                p = false;
            }
        }
        return s;
    }
}