package org.solutions.leetcode.string.easy;

import java.time.Instant;
import java.util.Stack;

public class LongestValidParentheses {

    /**
     * Given a string containing just the characters '(' and ')',
     * return the length of the longest valid (well-formed) parentheses substring
     * <p>
     * Example 1:
     * Input: s = "(()"
     * Output: 2
     * <p>
     * Example 2:
     * Input: s = ")()())"
     * Output: 4
     * <p>
     * Example 3:
     * Input: s = ""
     * Output: 0
     */
    public static void main(String[] args) {
//        System.out.println(findLongestValidParenthesesLength(""));
//        System.out.println(findLongestValidParenthesesLength(")()())"));
//        System.out.println(findLongestValidParenthesesLength("(()"));
//        System.out.println(findLongestValidParenthesesLength("((())))))()()(())"));
        String s = "())()()(())((()(()()(((()))((((())((()(())()())(()((((()))()(()))(())()(())(()(((((())((((((()())())(()(()((())()))(()))))))()(()))((((())()()()))()()()(((()(()())(()()(()(()()(((()))))))()()))())())((()()))))))((()))(((()((())()(()()))((())))()()())))))))()))))(()))))()))()))()((())))((()))(()))))))(((()))))))))()(()()()(())((())()))()()(())))()()))(()())()))(((()())()))((())((((()))(()(()(()()()(((())()(((((()))((()(((((())(()()))((((((((()(()(()(()(())))(())(()())())(()((((()(())((()(())))(())))()(((((()(()()(())))))))())(())(())(()()(((())))((()))(((((()))))())))()((()))()))))())))))((())(((((()()))((((())))(((()(()(())())(((()(()(()()()())))())()))((()((())())()()()(((())(((((()((((((()((()())))((((())((()(((((((()(()((()()()(()(()())(()(()()((((())))()(((()())))(()()))()(()()()()(((((())(()))))((()))())))()((((((()))())))()(()))(())))((((()())(((((()()())(((((())(()())(()))))()(()()))()))))))())))(((())(()(()()))(()))()(((())))())((((()(((()))))))()(()(()))()()(()()))))))))((()))))))(())((()((()))()))((((((()())))))(()((())((((()))))(()(()()()()(()))()()(()(()))(()()(((((((()())(())(()())((())())()(()())((())()())())(()())))())))(())())())(())((()())(((()()))()))()()))()(()(())((((((((())))()((())((()((((((((((()))))(()(((((())(()(()())())))((())())))))()))(()((()()))((()((())()()()((()(())())((())())(()()(((())))))())()()(()))()())(()(()((())))((((()()(())))())(())(()(()(())())())(()()())()(())())))(()()(((())))((()()(((())()()(()())((((()()(()())(()((((()(()()(()(()(((()((()())(()()))(()((((()(((((()))))()()))(((()((((((()(()()()()())()))(()(())))))((()(((()())())))(((()()))(()(()(((((((()()))(()(())))())()(())())(())(()))(())(()))()()(()()())))))()))()((())(((()((((((((())()()))())))((()())(";
        String s1 = "())()()(())((()(()()(((()))((((())((()(())()())(()((((()))";
        String s2 = "((((())((()(())()())(()((((()))";
        String s3 = "((())))))()()(())";
        long start = Instant.now().toEpochMilli();
        System.out.println(findLongestValidParenthesesLength1(s3));
        System.out.println("Total Time taken 1 : " + (Instant.now().toEpochMilli() - start) + " ms ");
        start = Instant.now().toEpochMilli();
        System.out.println(findLongestValidParenthesesLength(s3));
        System.out.println("Total Time taken 2 : " + (Instant.now().toEpochMilli() - start) + " ms ");
    }


    private static int findLongestValidParenthesesLength(String s){
        Stack<Integer> stack = new Stack<>();
        int length;
        int maxLength = 0;
        stack.push(-1);
        for (int i = 0;i < s.length();++i) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.empty()) {
                    length = i - stack.peek();
                    maxLength = Math.max(maxLength, length);
                } else {
                    stack.push(i);
                }
            }
        }
        return maxLength;
    }


    /**
     * This solution is working but taking high time for large strings
     */
    private static int findLongestValidParenthesesLength1(String s){
        int length = 0;
        for(int beginIndex=0; beginIndex<s.length()-1; beginIndex++){
            for(int currentIndex=beginIndex+1; currentIndex<=s.length(); currentIndex++){
                String subStr = s.substring(beginIndex, currentIndex);
                if((subStr.length()%2 == 0) && validateParentheses(subStr) && (length<subStr.length())){
                    length = subStr.length();
                }
            }
        }
        return length;
    }

    private static boolean validateParentheses(String s){
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else {
                if(stack.empty() || stack.pop()!=c){
                    return false;
                }
            }
        }
        return stack.empty();
    }

}
