package org.solutions.string;

import java.util.Stack;

public class NestingDepthOfParentheses {

    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth( "(1)+((2))+(((3)))"));
    }

    public static int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        for (char c : s.toCharArray()){
            if(c == '('){
                depth++;
            }else if(c == ')'){
                depth--;
            }
            maxDepth = Math.max(maxDepth, depth);
        }
        return maxDepth;
    }

}
