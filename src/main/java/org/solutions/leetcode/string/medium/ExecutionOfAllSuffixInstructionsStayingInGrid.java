package org.solutions.leetcode.string.medium;

import org.solutions.leetcode.string.easy.PrintUtil;

/**
 * @author Arti Harde
 */
public class ExecutionOfAllSuffixInstructionsStayingInGrid {

    public static void main(String[] args) {
        PrintUtil.printArray(executeInstructions(3, new int[]{0,1}, "RRDDLU"));
        PrintUtil.printArray(executeInstructions(2, new int[]{1,1}, "LURD"));
        PrintUtil.printArray(executeInstructions(1, new int[]{0,0}, "LRUD"));
    }

    public static int[] executeInstructions(int n, int[] startPos, String s) {
        int[] steps = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            int j = i;
            int startX = startPos[0];
            int startY = startPos[1];
            int count = 0;
            while (j < s.length()){
                switch (s.charAt(j)){
                    case 'R' :
                        startY = startY + 1;
                        break;
                    case 'L' :
                        startY = startY - 1;
                        break;
                    case 'U' :
                        startX = startX - 1;
                        break;
                    case 'D' :
                        startX = startX + 1;
                        break;
                }
                if(startX >= 0 && startX <= n-1 && startY >= 0 && startY <= n-1){
                    j++;
                    count++;
                }else {
                    break;
                }
            }
            steps[i] = count;
        }
        return steps;
    }

}