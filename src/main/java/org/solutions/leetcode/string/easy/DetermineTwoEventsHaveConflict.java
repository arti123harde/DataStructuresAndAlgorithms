package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class DetermineTwoEventsHaveConflict {

    public static void main(String[] args) {
        System.out.println(haveConflict(new String[]{"14:13","22:08"}, new String[]{"02:40","08:08"}));
        System.out.println(haveConflict(new String[]{"01:15","02:00"}, new String[]{"02:00","03:00"}));
        System.out.println(haveConflict(new String[]{"01:00","02:00"}, new String[]{"01:20","03:00"}));
        System.out.println(haveConflict(new String[]{"10:00","11:00"}, new String[]{"14:00","15:00"}));
    }

    public static boolean haveConflict(String[] event1, String[] event2) {
        return !((event1[0].compareTo(event2[0]) < 0 && event1[1].compareTo(event2[0]) < 0) ||
                (event2[0].compareTo(event1[0]) < 0 && event2[1].compareTo(event1[0]) < 0));
    }
}