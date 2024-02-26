package org.solutions.leetcode.string.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Arti Harde
 */
public class IndexPairsOfStrings {

    public static void main(String[] args) {
        PrintUtil.printArray(indexPairs("thestoryofleetcodeandme",
                new String[]{"story","fleet","leetcode"}));
        PrintUtil.printArray(indexPairs("ababa", new String[]{"aba","ab"}));
    }

    public static int[][] indexPairs(String text, String[] words) {
        List<List<Integer>> list = new LinkedList<>();
        Map<Character, List<Integer>> map = new HashMap<>();
        for(int i=0; i<text.length(); i++){
            if(!map.containsKey(text.charAt(i))){
                map.put(text.charAt(i), new LinkedList<>());
            }
            map.get(text.charAt(i)).add(i);
        }
        for(String word: words){
            List<Integer> indexes = map.get(word.charAt(0));
            for(int i : indexes){
                if(i + word.length() <= text.length() && word.equals(text.substring(i, i + word.length()))){
                    List<Integer> list1 = new LinkedList<>();
                    list1.add(i);
                    list1.add(i + word.length() - 1);
                    list.add(list1);
                }
            }
        }
        list.sort((item1, item2) -> {
            if (item1.get(0) > item2.get(0)) {
                return 1;
            } else if (item1.get(0) < item2.get(0)) {
                return -1;
            } else if (Objects.equals(item1.get(0), item2.get(0))) {
                return item1.get(1).compareTo(item2.get(1));
            }
            return 0;
        });
        int[][] result = new int[list.size()][2];
        final int[] index = {0};
        list.forEach(lis1 -> {
            result[index[0]][0] = lis1.get(0);
            result[index[0]][1] = lis1.get(1);
            index[0]++;
        });
        return result;
    }
}