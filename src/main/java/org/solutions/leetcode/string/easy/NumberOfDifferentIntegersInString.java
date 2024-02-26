package org.solutions.leetcode.string.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class NumberOfDifferentIntegersInString {

    public static void main(String[] args) {
        System.out.println(numDifferentIntegers("00a000"));
        System.out.println(numDifferentIntegers("2393706880236110407059624696967828762752651982730115221690437821508229419410771541532394006597463715513741725852432559057224478815116557380260390432211227579663571046845842281704281749571110076974264971989893607137140456254346955633455446057823738757323149856858154529105301197388177242583658641529908583934918768953462557716z97438020429952944646288084173334701047574188936201324845149110176716130267041674438237608038734431519439828191344238609567530399189316846359766256507371240530620697102864238792350289978450509162697068948604722646739174590530336510475061521094503850598453536706982695212493902968251702853203929616930291257062173c79487281900662343830648295410"));
        System.out.println(numDifferentIntegers("a123bc34d8ef34"));
        System.out.println(numDifferentIntegers("leet1234code234"));
        System.out.println(numDifferentIntegers("a1b01c001"));
        System.out.println(numDifferentIntegers("167278959591294"));
    }

    public static int numDifferentIntegers(String word) {
        int len = word.length() - 1;
        Set<String> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<=len; i++){
            boolean isDigit = Character.isDigit(word.charAt(i));
            if(isDigit){
                stringBuilder.append(word.charAt(i));
            }
            if(!isDigit || (i == len)){
                if(stringBuilder.length() > 0){
                    String s = stringBuilder.toString().startsWith("0") ?
                            removeLeadingZeros(stringBuilder.toString()) : stringBuilder.toString();
                    set.add(s);
                }
                stringBuilder = new StringBuilder();
            }
        }
        return set.size();
    }

    public static String removeLeadingZeros(String s){
        int index = 0;
        while (index < s.length() && s.charAt(index) == '0'){
            index++;
        }
        return index == s.length() ? "0" : s.substring(index);
    }

}