package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class ReformatString {

    public static void main(String[] args) {
        System.out.println(reformat("covid2019"));
        System.out.println(reformat("a0b1c2"));
        System.out.println(reformat("leetcode"));
        System.out.println(reformat("1229857369"));
    }

    public static String reformat(String s) {
        if(s.length() == 1){
            return s;
        }else{
            List<String> characterList = new ArrayList<>();
            List<String> integerList = new ArrayList<>();
            for(int i=0; i< s.length(); i++){
                if(Character.isDigit(s.charAt(i))){
                    integerList.add(String.valueOf(s.charAt(i)));
                }else if(Character.isLetter(s.charAt(i))){
                    characterList.add(String.valueOf(s.charAt(i)));
                }
            }
            if((characterList.isEmpty() && integerList.isEmpty()) || Math.abs(characterList.size()-integerList.size()) > 1){
                return "";
            }else{
                return characterList.size() > integerList.size() ?
                        buildString(characterList, integerList) : buildString(integerList, characterList);
            }
        }
    }

    private static String buildString(List<String> list1, List<String> list2){
        StringBuilder sBuilder = new StringBuilder();
        for(int i = 0; i<list1.size(); i++){
            sBuilder.append(list1.get(i));
            if(i< list2.size()){
                sBuilder.append(list2.get(i));
            }
        }
        return sBuilder.toString();
    }
}