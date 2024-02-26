package org.solutions.leetcode.string.easy;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidateParentheses {

    /**
     * Given a string s containing just the characters
     * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     */
    public static void main(String[] args) {
        String s1 = "(({}))(([[[[{{}}]]]]))";
        String s2 = "[])";
        String s3 = "}}}))[[]]";
//        System.out.println(s1 + " : " + validateParentheses(s1));
        System.out.println(s2 + " : " + validateParentheses(s2));
//        System.out.println(s3 + " : " + validateParentheses(s3));
    }

    private static boolean validateParentheses(String s){
        boolean result = false;
        List<Character> s1 = Arrays.asList('(', '{', '[');
        Stack<Character> stack = new Stack<>();
        int index = 0;
        if(!s.startsWith(")") && !s.startsWith("}") && !s.startsWith("]")) {
            while (index != s.length()) {
                char c1 = s.charAt(index);
                if (s1.contains(c1)) {
                    stack.push(c1);
                } else {
                    if (!stack.isEmpty()) {
                        Character character = stack.pop();
                        if ((c1 == ')' && character == '(')
                                || (c1 == '}' && character == '{')
                                || (c1 == ']' && character == '[')) {
                            result = true;
                        } else {
                            result = false;
                            break;
                        }
                    }else{
                        result = false;
                        break;
                    }
                }
                index++;
            }
            if(!stack.isEmpty()){
                result = false;
            }
        }
        return result;
    }

    private boolean validateParentheses1(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '{'){
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '('){
                stack.push(')');
            }else if(stack.empty() || stack.pop() != c){
                return false;
            }
        }
        return stack.empty();
    }

}
