package org.solutions.leetcode.string.easy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class ReformatDate {

    public static void main(String[] args) {
        System.out.println(reformatDate("20th Oct 2052"));
        System.out.println(reformatDate("6th Jun 1933"));
        System.out.println(reformatDate("26th May 1960"));
    }

    public static String reformatDate(String date) {
        List<String> months = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        String[] splits = date.split(" ");
        int month = months.indexOf(splits[1]) + 1;
        String day = splits[0].substring(0, splits[0].length()-2);
        return splits[2] + "-" + (month < 10 ? ("0" + month) : month) + "-" + (day.length() < 2 ? ("0" + day) : day);
    }
}