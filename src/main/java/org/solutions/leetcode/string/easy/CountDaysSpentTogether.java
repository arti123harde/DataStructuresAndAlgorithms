package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class CountDaysSpentTogether {

    public static void main(String[] args) {
        System.out.println(countDaysTogether("09-01", "10-19", "06-19", "10-20"));
        System.out.println(countDaysTogether("10-20", "12-22", "06-21", "07-05"));
        System.out.println(countDaysTogether("08-15", "08-18", "08-16", "08-19"));
        System.out.println(countDaysTogether("10-01", "10-31", "11-01", "12-31"));
    }

    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        if(arriveAlice.compareTo(arriveBob) == 0){
            if(leaveAlice.compareTo(leaveBob) == 0){
                return countDays(Integer.parseInt(arriveAlice.substring(0, 2)), Integer.parseInt(arriveAlice.substring(3)),
                        Integer.parseInt(leaveAlice.substring(0, 2)), Integer.parseInt(leaveAlice.substring(3)));
            }else if(leaveAlice.compareTo(leaveBob) > 0){
                return countDays(Integer.parseInt(arriveBob.substring(0, 2)), Integer.parseInt(arriveBob.substring(3)),
                        Integer.parseInt(leaveBob.substring(0, 2)), Integer.parseInt(leaveBob.substring(3)));
            }else if(leaveAlice.compareTo(leaveBob) < 0){
                return countDays(Integer.parseInt(arriveAlice.substring(0, 2)), Integer.parseInt(arriveAlice.substring(3)),
                        Integer.parseInt(leaveAlice.substring(0, 2)), Integer.parseInt(leaveAlice.substring(3)));
            }
        }else if(arriveAlice.compareTo(arriveBob) > 0){
            if(leaveAlice.compareTo(leaveBob) == 0){
                return countDays(Integer.parseInt(arriveAlice.substring(0, 2)), Integer.parseInt(arriveAlice.substring(3)),
                        Integer.parseInt(leaveAlice.substring(0, 2)), Integer.parseInt(leaveAlice.substring(3)));
            }else if(leaveAlice.compareTo(leaveBob) > 0 && arriveAlice.compareTo(leaveBob) <= 0){
                return countDays(Integer.parseInt(arriveAlice.substring(0, 2)), Integer.parseInt(arriveAlice.substring(3)),
                        Integer.parseInt(leaveBob.substring(0, 2)), Integer.parseInt(leaveBob.substring(3)));
            }else if(leaveAlice.compareTo(leaveBob) < 0){
                return countDays(Integer.parseInt(arriveAlice.substring(0, 2)), Integer.parseInt(arriveAlice.substring(3)),
                        Integer.parseInt(leaveAlice.substring(0, 2)), Integer.parseInt(leaveAlice.substring(3)));
            }
        }else if(arriveAlice.compareTo(arriveBob) < 0){
            if(leaveAlice.compareTo(leaveBob) == 0){
                return countDays(Integer.parseInt(arriveBob.substring(0, 2)), Integer.parseInt(arriveBob.substring(3)),
                        Integer.parseInt(leaveBob.substring(0, 2)), Integer.parseInt(leaveBob.substring(3)));
            }else if(leaveAlice.compareTo(leaveBob) > 0){
                return countDays(Integer.parseInt(arriveBob.substring(0, 2)), Integer.parseInt(arriveBob.substring(3)),
                        Integer.parseInt(leaveBob.substring(0, 2)), Integer.parseInt(leaveBob.substring(3)));
            }else if(leaveAlice.compareTo(leaveBob) < 0 && arriveBob.compareTo(leaveAlice) <= 0){
                return countDays(Integer.parseInt(arriveBob.substring(0, 2)), Integer.parseInt(arriveBob.substring(3)),
                         Integer.parseInt(leaveAlice.substring(0, 2)), Integer.parseInt(leaveAlice.substring(3)));
            }
        }
        return 0;
    }

    public static int countDays(int m1, int d1, int m2, int d2){
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int numOfDays = 0;
        if(m1 == m2){
            numOfDays = Math.abs(d2 - d1) + 1;
        }else if(m1 < m2){
            numOfDays = daysInMonth[m1-1] - d1 + 1;
            for(int i=m1; i<m2-1; i++){
                numOfDays = numOfDays + daysInMonth[i];
            }
            numOfDays = numOfDays + d2;
        }
        return numOfDays;
    }

}