package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class CrawlerLogFolder {

    public static void main(String[] args) {
        System.out.println(minOperations(new String[]{"./","wz4/","../","mj2/","../","../","ik0/","il7/"}));
        System.out.println(minOperations(new String[]{"d1/","d2/","../","d21/","./"}));
        System.out.println(minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"}));
        System.out.println(minOperations(new String[]{"d1/","../","../","../"}));
    }

    public static int minOperations(String[] logs) {
        int count = 0;
        for(String word : logs){
            if(word.matches("[a-z0-9]*/")){
                count++;
            }else if(word.equals("../") && count!=0){
                count--;
            }
        }
        return Math.max(count, 0);
    }

    public static int minOperations1(String[] logs) {
        List<String> folderPath = new ArrayList<>();
        for(String word : logs){
            if(word.matches("[a-z0-9]*/")){
                folderPath.add(word);
            }else if(word.equals("../") && !folderPath.isEmpty()){
                folderPath.remove(folderPath.size()-1);
            }
        }
        return folderPath.size();
    }
}