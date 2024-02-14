package org.solutions.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperations {

    public static void main(String[] args) {
        setOfList();
    }

    public static void setOfList(){
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        List<Integer> list2 = Arrays.asList(1,2,3,4);
        List<Integer> list3 = Arrays.asList(6,7,7,4);
        List<Integer> list4 = Arrays.asList(6,2,3,8);
        set.add(list1);
        set.add(list2);
        set.add(list3);
        set.add(list4);
        System.out.println("Size of set : " + set.size());
        for (List<Integer> set1 : set){
            System.out.println(set1);
        }
        List<List<Integer>> list = new ArrayList<>(set);
    }
}
