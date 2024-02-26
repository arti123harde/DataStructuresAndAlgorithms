package org.solutions.leetcode.string.easy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Arti Harde
 */
public class MinimumOperationsToConvertTime {

    public static void main(String[] args) {
        System.out.println(convertTime("02:30", "04:35"));
        System.out.println(convertTime("11:00", "11:01"));
        System.out.println(convertTime("09:41", "10:34"));
        System.out.println(convertTime("10:47", "18:53"));
    }

    public static int convertTime(String current, String correct) {
        int count = 0;
        int currentHours = Integer.parseInt(current.substring(0, 2));
        int correctHours = Integer.parseInt(correct.substring(0, 2));
        int currentMinutes = Integer.parseInt(current.substring(3));
        int correctMinutes = Integer.parseInt(correct.substring(3));
        int minuteDiff = (correctHours*60+correctMinutes) - (currentHours*60+currentMinutes);
        if(minuteDiff >= 60){
            count = count + minuteDiff / 60;
            minuteDiff = minuteDiff % 60;
        }
        if(minuteDiff >= 15){
            count = count + minuteDiff / 15;
            minuteDiff = minuteDiff % 15;
        }
        if(minuteDiff >= 5){
            count  = count + minuteDiff / 5;
            minuteDiff = minuteDiff % 5;
        }
        if(minuteDiff < 5){
            count = count + minuteDiff;
        }
        return count;
    }
}