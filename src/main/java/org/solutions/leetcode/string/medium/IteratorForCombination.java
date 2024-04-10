package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class IteratorForCombination {

    private List<String> strings = new ArrayList<>();

    public static void main(String[] args) {
        IteratorForCombination iteratorForCombination = new IteratorForCombination("cph", 1);
        System.out.println(iteratorForCombination.hasNext());
        System.out.println(iteratorForCombination.next());
        System.out.println(iteratorForCombination.hasNext());
        System.out.println(iteratorForCombination.hasNext());
        System.out.println(iteratorForCombination.next());
        System.out.println(iteratorForCombination.next());
        System.out.println(iteratorForCombination.hasNext());
        System.out.println(iteratorForCombination.hasNext());
        System.out.println(iteratorForCombination.hasNext());
        System.out.println(iteratorForCombination.hasNext());
    }


    public IteratorForCombination(String characters, int combinationLength) {
        Set<String> set = new LinkedHashSet<>();
        findAllStrings(characters, combinationLength, set);
        strings = new ArrayList<>(set);
        Collections.reverse(strings);
    }

    public void findAllStrings(String characters, int combinationLength, Set<String> strings){
        for(int index=0; index<characters.length(); index++){
//            for(int i=index+1; i + combinationLength - 1 <= characters.length(); i++){
//                strings.add(characters.charAt(index) + characters.substring(i, i+combinationLength-1));
//            }
            int j = index+1;
            while(j + combinationLength - 1 <= characters.length()){
                strings.add(characters.charAt(index) + characters.substring(j, j+combinationLength-1));
                j++;
            }
        }
    }

    public String next() {
        String s = strings.get(strings.size()-1);
        strings.remove(strings.size()-1);
        return s;
    }

    public boolean hasNext() {
        return strings.size() > 0;
    }
}