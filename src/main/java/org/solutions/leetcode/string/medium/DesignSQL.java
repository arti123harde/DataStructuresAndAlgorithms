package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class DesignSQL {

    public Map<String, List<List<String>>> table = new HashMap<>();

    public static void main(String[] args) {
        List<String> names = Arrays.asList("one", "two", "three");
        List<Integer> columns = Arrays.asList(2, 3, 1);
        DesignSQL obj = new DesignSQL(names, columns);
        obj.insertRow("two", Arrays.asList("first", "second", "third"));
        System.out.println(obj.selectCell("two", 1, 3));
        obj.insertRow("two", Arrays.asList("fourth", "fifth", "sixth"));
        obj.deleteRow("two", 1);
        System.out.println(obj.selectCell("two", 2, 2));
    }

    public DesignSQL(List<String> names, List<Integer> columns) {
        for(String name : names){
            table.put(name, new ArrayList<>());
        }
    }

    public void insertRow(String name, List<String> row) {
        table.get(name).add(row);
    }

    public void deleteRow(String name, int rowId) {
        table.get(name).set(rowId - 1, new ArrayList<>());
    }

    public String selectCell(String name, int rowId, int columnId) {
        return table.get(name).get(rowId - 1).get(columnId - 1);
    }
}