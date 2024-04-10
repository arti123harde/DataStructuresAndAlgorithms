package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class DisplayTableOfFoodOrdersInRestaurant {
    public static void main(String[] args) {
        List<List<String>> orders = new ArrayList<>();
        orders.add(Arrays.asList("David","3","Ceviche"));
        orders.add(Arrays.asList("Corina","10","Beef Burrito"));
        orders.add(Arrays.asList("David","3","Fried Chicken"));
        orders.add(Arrays.asList("Carla","5","Water"));
        orders.add(Arrays.asList("Carla","5","Ceviche"));
        orders.add(Arrays.asList("Rous","3","Ceviche"));
        System.out.println(displayTable(orders));
    }

    public static List<List<String>> displayTable(List<List<String>> orders) {
        Map<Integer, Map<String, Integer>> tableOrders = new LinkedHashMap<>();
        List<String> food = new ArrayList<>();
        List<Integer> tableIds = new ArrayList<>();
        for(List<String> order : orders){
            Integer tableId = Integer.valueOf(order.get(1));
            if(!tableIds.contains(tableId)){
                tableIds.add(tableId);
            }
            if(!tableOrders.containsKey(tableId)){
                tableOrders.put(tableId, new HashMap<>());
            }
            if(!tableOrders.get(tableId).containsKey(order.get(2))){
                tableOrders.get(tableId).put(order.get(2), 0);
            }
            tableOrders.get(tableId).put(order.get(2), tableOrders.get(tableId).get(order.get(2)) + 1);
            if(!food.contains(order.get(2))){
                food.add(order.get(2));
            }
        }
        Collections.sort(food);
        Collections.sort(tableIds);
        List<List<String>> result = new ArrayList<>();
        result.add(food);
        for(Integer tableId : tableIds){
            List<String> row = new ArrayList<>();
            row.add(String.valueOf(tableId));
            Map<String, Integer> foodList = tableOrders.get(tableId);
            for(String f : food){
                String count = !foodList.isEmpty() && foodList.get(f) != null ? String.valueOf(foodList.get(f)) : "0" ;
                row.add(count);
            }
            result.add(row);
        }
        result.get(0).add(0, "Table");
        return result;
    }
}