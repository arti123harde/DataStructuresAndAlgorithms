package org.solutions.leetcode.string.easy;

public class DIStringMatch {

    public static void main(String[] args) {
        printArray(diStringMatch("IDID"));
        printArray(diStringMatch("III"));
        printArray(diStringMatch("DDI"));
    }

    public static int[] diStringMatch(String s) {
        int[] result = new int[s.length()+1];
        int c = 0;
        int i = 0;
        int j = s.length();
        while (c < s.length()){
            if(s.charAt(c) == 'I'){
                result[c] = i;
                i++;
            }else if(s.charAt(c) == 'D'){
                result[c] = j;
                j--;
            }
            c++;
        }
        result[c] = i;
        return result;
    }

    public static int[] diStringMatch1(String s) {
        int[] result = new int[s.length()+1];
        int temp = 0;
        for(int i=0; i<s.length()+1; i++){
            result[i] = i;
        }
        for(int j=0; j<s.length(); j++){
            if(s.charAt(j) == 'I'){
                if(result[j] > result[j+1]){
                    temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            } else if (s.charAt(j) == 'D') {
                if(result[j] < result[j+1]){
                    temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;
                }
            }
        }
        return result;
    }


    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
