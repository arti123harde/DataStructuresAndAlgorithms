package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Arti Harde
 */
public class LexicographicalStringOfAllHappyStrings {

    public static void main(String[] args) {
        System.out.println(getHappyString(3, 9));
        System.out.println(getHappyString(1, 3));
        System.out.println(getHappyString(1, 4));
    }

    public static String getHappyString(int n, int k) {
        List<String> result = new ArrayList<>();
        recursion("", result, n);
        Collections.sort(result);
        return result.size() >= k ? result.get(k-1) : "";
    }

    public static void recursion(String s, List<String> results, int n){
        if(s.length() == n){
            results.add(s);
            return;
        }
        if(s.equals("")){
            recursion("a", results, n);
            recursion("b", results, n);
            recursion("c", results, n);
        }else if(s.endsWith("a")){
            recursion(s + "b", results, n);
            recursion(s + "c", results, n);
        }else if(s.endsWith("b")){
            recursion(s + "a", results, n);
            recursion(s + "c", results, n);
        }else if(s.endsWith("c")){
            recursion(s + "a", results, n);
            recursion(s + "b", results, n);
        }
    }
}