package org.solutions.leetcode.string.easy;

import java.util.Stack;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        System.out.println(removeOuterParentheses("()()"));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder finalString = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
                s1.append(c);
            }else if(c == ')'){
                s1.append(c);
                stack.pop();
            }
            if(stack.empty()){
                String tempStr = s1.toString();
                s1 = new StringBuilder();
                finalString.append(tempStr, 1, tempStr.length() - 1);
            }
        }
        return finalString.toString();
    }
}
