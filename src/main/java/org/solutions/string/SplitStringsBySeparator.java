package org.solutions.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStringsBySeparator {

    public static void main(String[] args) {
        System.out.println(splitWordsBySeparator(Arrays.asList("one.two.three","four.five","six"), '.'));
        System.out.println(splitWordsBySeparator(Arrays.asList("$easy$","$problem$"), '$'));
        System.out.println(splitWordsBySeparator(Arrays.asList("|||"), '|'));
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> strings = new ArrayList<>();
        for(String word : words){
            String s = "";
            for(char c : word.toCharArray()){
                if(c == separator){
                   if(!s.equals("")){
                       strings.add(s);
                   }
                    s = "";
                }else{
                    s = s + c;
                }
            }
            if(!s.equals("")){
                strings.add(s);
            }
        }
        return strings;
    }
}
