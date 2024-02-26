package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class CircularSentence {

    public static void main(String[] args) {
        System.out.println(isCircularSentence("leetcode exercises sound delightful"));
        System.out.println(isCircularSentence("eetcode"));
        System.out.println(isCircularSentence("Leetcode is cool"));
    }

    public static boolean isCircularSentence(String sentence) {
        String[] splits = sentence.split(" ");
        if(splits.length == 1 && splits[0].charAt(0) != splits[0].charAt(splits[0].length()-1)){
            return false;
        }else if(splits[0].charAt(0) != splits[splits.length-1].charAt(splits[splits.length-1].length()-1)){
            return false;
        }else{
            int index = 0;
            while(index<splits.length-1){
                if(splits[index].charAt(splits[index].length()-1) != splits[index+1].charAt(0)){
                    return false;
                }
                index++;
            }
        }
        return true;
    }

    public static boolean isCircularSentence1(String sentence) {
        String[] splits = sentence.split(" ");
        if(splits.length == 1 && !String.valueOf(splits[0].charAt(0)).equalsIgnoreCase(String.valueOf(splits[0].charAt(splits[0].length()-1)))){
            return false;
        }else if(!String.valueOf(splits[0].charAt(0)).equalsIgnoreCase(String.valueOf(splits[splits.length-1].charAt(splits[splits.length-1].length()-1)))){
            return false;
        }else{
            int index = 0;
            while(index<splits.length-1){
                if(!String.valueOf(splits[index].charAt(splits[index].length()-1)).equalsIgnoreCase(String.valueOf(splits[index+1].charAt(0)))){
                    return false;
                }
                index++;
            }
        }
        return true;
    }

}