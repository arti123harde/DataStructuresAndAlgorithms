package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Arti Harde
 */
public class OccurrencesAfterBigram {

    public static void main(String[] args) {
        PrintUtil.printArray(findOcurrences("we we we we will rock you", "we", "we"));
        PrintUtil.printArray(findOcurrences("jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa",
                "kcyxdfnoa", "jkypmsxd"));
        PrintUtil.printArray(findOcurrences("alice is a good girl she is a good student", "a", "good"));
        PrintUtil.printArray(findOcurrences("we will we will rock you", "we", "will"));
        PrintUtil.printArray(findOcurrences("alice is aa good girl she is a good student", "a", "good"));
    }

    public static String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        int index = 0;
        String[] splits = text.split(" ");
        String[] findWord = (first + " " + second).split(" ");
        while (index + findWord.length < splits.length){
            boolean isMatch = true;
            for(int i=0; i<findWord.length; i++){
                if(!Objects.equals(splits[index + i], findWord[i])) {
                    isMatch = false;
                    break;
                }
            }
            if(isMatch){
                list.add(splits[index + findWord.length]);
            }
            index++;
        }
        return list.toArray(new String[0]);
    }

    public static String[] findOcurrences1(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String firstSecondWord = first + " " + second + " ";
        text = text + " ";
        while (true){
            int startIndex = text.indexOf(firstSecondWord);
            if(startIndex != -1 && startIndex + firstSecondWord.length()<text.length()){
                text = text.substring(startIndex + firstSecondWord.length());
                list.add(text.substring(0, text.indexOf(" ")));
            }else {
                break;
            }
        }
        return list.toArray(new String[0]);
    }
}