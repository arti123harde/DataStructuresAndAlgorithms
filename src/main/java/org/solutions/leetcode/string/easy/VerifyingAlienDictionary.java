package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class VerifyingAlienDictionary {

    public static void main(String[] args) {
        System.out.println(isAlienSorted(new String[]{"lkppty","lkpprg"}, "loxbzapnmstkhijfcuqdewyvrg"));
        System.out.println(isAlienSorted(new String[]{"iekm","tpnhnbe"}, "loxbzapnmstkhijfcuqdewyvrg"));
        System.out.println(isAlienSorted(new String[]{"hello","hello"}, "hlabcdefgijkmnopqrstuvwxyz"));
        System.out.println(isAlienSorted(new String[]{"hello","leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
        System.out.println(isAlienSorted(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
        System.out.println(isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz"));
        System.out.println(isAlienSorted(new String[]{"app","apple"}, "abcdefghijklmnopqrstuvwxyz"));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        List<String> list = new ArrayList<>(List.of(order.split("")));
        for(int i=0; i<words.length-1; i++){
            if(!checkIfSorted(words[i], words[i+1], list)){
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfSorted(String w1, String w2, List<String> list){
        if(w1.equals(w2)){
            return true;
        }else {
            boolean result = true;
            for (int i = 0; i < w1.length(); i++) {
                if (i < w2.length()) {
                    if (list.indexOf(String.valueOf(w1.charAt(i))) < list.indexOf(String.valueOf(w2.charAt(i)))) {
                        result = true;
                        break;
                    }else if(list.indexOf(String.valueOf(w1.charAt(i))) > list.indexOf(String.valueOf(w2.charAt(i)))){
                        result = false;
                        break;
                    }
                }else {
                    result = false;
                    break;
                }
            }
            return result;
        }
    }
}