package org.solutions.string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    /**
     * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
     * Example 1:
     * Input: n = 3
     * Output: ["((()))","(()())","(())()","()(())","()()()"]
     *
     * Example 2:
     * Input: n = 1
     * Output: ["()"]
     */
    public static void main(String[] args) {
        int n = 2;
        List<String> balancedParentheses = new ArrayList<>();
        generateParentheses(balancedParentheses, "", 0, 0, n);
        System.out.println("Balanced Parentheses : " + balancedParentheses);
    }

    private static void generateParentheses(List<String> balancedParentheses, String str, int openIndex, int closeIndex, int maxIndex){
        if(str.length() == maxIndex*2){
            balancedParentheses.add(str);
            return;
        }
        if(openIndex < maxIndex){
            generateParentheses(balancedParentheses, str + "(", openIndex + 1, closeIndex, maxIndex);
        }
        if(closeIndex < openIndex){
            generateParentheses(balancedParentheses, str + ")", openIndex, closeIndex + 1, maxIndex);
        }
    }
}
