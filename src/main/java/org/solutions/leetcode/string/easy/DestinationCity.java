package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class DestinationCity {

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London","New York"));
        paths.add(Arrays.asList("Lima","Sao Paulo"));
        paths.add(Arrays.asList("New York","Lima"));
        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        LinkedList<String> route = new LinkedList<>();
        int start = 0;
        route.add(paths.get(0).get(0));
        route.add(paths.get(0).get(1));
        String lastCity = paths.get(0).get(1);
        while (start < paths.size()-1){
            String finalLastCity = lastCity;
            Optional<List<String>> optional = paths.stream().filter(list -> list.get(0).equals(finalLastCity)).findFirst();
            if(optional.isPresent()){
                route.add(optional.get().get(1));
                lastCity = optional.get().get(1);
            }
            start ++;
        }
        return route.getLast();
    }
}
