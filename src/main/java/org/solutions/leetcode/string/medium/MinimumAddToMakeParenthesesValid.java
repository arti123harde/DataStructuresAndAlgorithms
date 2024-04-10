package org.solutions.leetcode.string.medium;

import java.util.Stack;

/**
 * @author Arti Harde
 */
public class MinimumAddToMakeParenthesesValid {

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid(")()"));
        System.out.println(minAddToMakeValid("()))(("));
        System.out.println(minAddToMakeValid("((("));
        System.out.println(minAddToMakeValid("((()))((()"));
    }

    public static int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else {
                    count++;
                }
            }
        }
        return count + stack.size();
    }
}