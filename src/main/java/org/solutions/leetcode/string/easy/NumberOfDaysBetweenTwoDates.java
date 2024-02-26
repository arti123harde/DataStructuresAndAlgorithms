package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class NumberOfDaysBetweenTwoDates {

    public static void main(String[] args) {
        System.out.println(daysBetweenDates("2019-07-29", "2019-06-30"));
        System.out.println(daysBetweenDates("2019-06-29", "2019-06-30"));
        System.out.println(daysBetweenDates("2020-01-15", "2019-12-31"));
    }

    public static int daysBetweenDates(String date1, String date2) {
        int y1 = Integer.parseInt(date1.substring(0, 4));
        int y2 = Integer.parseInt(date2.substring(0, 4));
        int m1 = Integer.parseInt(date1.substring(5, 7));
        int m2 = Integer.parseInt(date2.substring(5, 7));
        int d1 = Integer.parseInt(date1.substring(8));
        int d2 = Integer.parseInt(date2.substring(8));
        if(y1 == y2){
            return Math.abs(dayOfYear(y1, m1, d1) - dayOfYear(y2, m2, d2));
        }else if(y1 < y2){
            int n1 = Math.abs(dayOfYear(y1, m1, d1) - dayOfYear(y1, 12, 31));
            int n2 = dayOfYear(y2, m2, d2);
            int n3 = 0;
            for(int i=y1+1; i<y2; i++){
                n3 = n3 + dayOfYear(i, 12, 31);
            }
            return n1 + n2 + n3;
        }else {
            int n1 = Math.abs(dayOfYear(y2, m2, d2) - dayOfYear(y2, 12, 31));
            int n2 = dayOfYear(y1, m1, d1);
            int n3 = 0;
            for(int i=y2+1; i<y1; i++){
                n3 = n3 + dayOfYear(i, 12, 31);
            }
            return n1 + n2 + n3;
        }
    }

    public static int dayOfYear(int y, int m, int d) {
        int numOfDays = 0;
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0; i<m-1; i++){
            numOfDays = numOfDays + daysInMonth[i];
            if(i == 1 && ((y % 100 == 0 && y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))){
                numOfDays++;
            }
        }
        numOfDays = numOfDays + d;
        return numOfDays;
    }

}