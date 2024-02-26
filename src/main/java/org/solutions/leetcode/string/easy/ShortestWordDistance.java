package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ShortestWordDistance {

    public static void main(String[] args) {
        System.out.println(shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
                "makes","coding"));
        System.out.println(shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"},
               "coding", "practice" ));
    }

    public static int shortestDistance(String[] wordsDict, String word1, String word2) {
        int min = Integer.MAX_VALUE;
        int index1 = -1;
        int index2 = -1;
        for(int i=0; i< wordsDict.length; i++){
            if(wordsDict[i].equals(word1)){
                index1 = i;
            }else if(wordsDict[i].equals(word2)){
                index2 = i;
            }
            if(index1!= -1 && index2!= -1){
                min = Math.min(min, Math.abs(index1-index2));
            }
        }
        return min;
    }
}