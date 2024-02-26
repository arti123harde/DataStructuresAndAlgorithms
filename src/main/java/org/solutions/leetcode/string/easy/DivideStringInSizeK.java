package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class DivideStringInSizeK {

    public static void main(String[] args) {
        PrintUtil.printArray(divideString("abcdefghi", 3, 'x'));
        PrintUtil.printArray(divideString("abcdefghij", 3, 'x'));
        PrintUtil.printArray(divideString("bgycymgbblobvpdf", 67, 'u'));
    }

    public static String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        int lastIndex = 0;
        for(int i=0; i<s.length(); i=i+k){
            if(i+k > s.length()){
                lastIndex = i;
            }else{
                list.add(s.substring(i, i+k));
            }
        }
        if(lastIndex != 0 || k>s.length()){
            list.add(s.substring(lastIndex) + String.valueOf(fill).repeat(k - s.substring(lastIndex).length()));
        }
        return list.toArray(new String[0]);
    }
}