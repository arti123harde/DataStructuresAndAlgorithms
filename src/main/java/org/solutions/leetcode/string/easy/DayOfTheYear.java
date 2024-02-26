package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class DayOfTheYear {

    public static void main(String[] args) {
        System.out.println(dayOfYear("1900-05-02"));
        System.out.println(dayOfYear("2019-01-09"));
        System.out.println(dayOfYear("2019-02-10"));
    }

    public static int dayOfYear(String date) {
        int numOfDays = 0;
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int days = Integer.parseInt(date.substring(8));
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0; i<month-1; i++){
            numOfDays = numOfDays + daysInMonth[i];
            if(i == 1 && ((year % 100 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))){
                numOfDays++;
            }
        }
        numOfDays = numOfDays + days;
        return numOfDays;
    }

}