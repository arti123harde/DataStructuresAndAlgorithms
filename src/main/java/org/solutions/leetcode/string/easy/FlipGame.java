package org.solutions.leetcode.string.easy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class FlipGame {

    public static void main(String[] args) {
        System.out.println(generatePossibleNextMoves("++++"));
        System.out.println(generatePossibleNextMoves("+"));
    }

    public static List<String> generatePossibleNextMoves(String currentState) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<currentState.length(); i++){
            if(currentState.charAt(i) == '+' && i+1<currentState.length() && currentState.charAt(i+1) == '+'){
                char[] chars = currentState.toCharArray();
                chars[i] = chars[i+1] = '-';
                list.add(new String(chars));
            }
        }
        return list;
    }
}