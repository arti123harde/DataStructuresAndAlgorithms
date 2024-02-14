package org.solutions.string;

import java.util.List;
import java.util.stream.Collectors;

public class GreatestEnglishLetterUpperLowerCase {

    //a-97, A-65 , z-122, Z-90
    public static void main(String[] args) {
        System.out.println(greatestLetter("lEeTcOdE"));
        System.out.println(greatestLetter("arRAzFif"));
        System.out.println(greatestLetter("AbCdEfGhIjK"));
    }

    public static String greatestLetter(String s) {
        char c1 = '0';
        List<Character> array = s.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        for(char c : s.toCharArray()){
            if(64 < c && c < 91 && array.contains((char)(c + 32)) && c1<c){
                c1 = c;
            }
        }
        if(c1 == '0'){
            return "";
        }else{
            return String.valueOf(c1);
        }
    }
}
