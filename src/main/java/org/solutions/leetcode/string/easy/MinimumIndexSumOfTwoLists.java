package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Arti Harde
 */
public class MinimumIndexSumOfTwoLists {

    public static void main(String[] args) {
        PrintUtil.printArray(findRestaurant(new String[]{"Shogun","Piatti","Tapioca Express","Burger King","KFC"},
                new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}));
        PrintUtil.printArray(findRestaurant(new String[]{"happy","sad","good"},
                new String[]{"sad","happy","good"}));
        PrintUtil.printArray(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"}));
        PrintUtil.printArray(findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},
                new String[]{"KFC","Shogun","Burger King"}));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        List<String> stringList1 = new ArrayList<>(List.of(list1));
        List<String> stringList2 = new ArrayList<>(List.of(list2));
        for(int i=0; i<stringList1.size(); i++){
            if(stringList2.contains(stringList1.get(i))){
                int sum = i + stringList2.indexOf(stringList1.get(i));
                if(sum < min){
                    min = sum;
                    if(!list.isEmpty()){
                        list.remove(list.size()-1);
                    }
                    list.add(stringList1.get(i));
                }else if(sum == min) {
                    list.add(stringList1.get(i));
                }
            }
        }
        return list.toArray(new String[0]);
    }

}