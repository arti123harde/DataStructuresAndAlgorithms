package org.solutions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ArrayToArrayList {
    public static void arrayToArrayList(String[] arr) {
        // Using List.of() method.
        ArrayList<String> arrayList = new ArrayList<>(List.of(arr));
        System.out.print(arrayList);
    }

    public static void arrayToArrayListInt(int[] arr) {
        // Using List.of() method.
        ArrayList<Integer> arrayList = (ArrayList<Integer>) (Arrays.stream(arr).boxed().collect(Collectors.toList()));
        System.out.print(arrayList);
    }

    public static void main(String[] args) {
        String[] array = { "ABC", "DEF", "GHI", "JKL" };
        int[] array1 = {1,0,-2,-1,0,-2,2,-1};
        arrayToArrayList(array);
        arrayToArrayListInt(array1);
    }
}