package org.solutions.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortPeople {

    public static void main(String[] args) {
        String[] results = sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170});
        System.out.println(Arrays.asList(results));
    }

    public static String[] sortPeople(String[] names, int[] heights) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        for(int i=0; i<names.length; i++){
            map.put(heights[i], names[i]);
        }
        LinkedHashMap<Integer, String> sortedMap = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        return sortedMap.values().toArray(new String[0]);
    }
}
