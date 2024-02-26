package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class NumberOfValidClockTimes {

    public static void main(String[] args) {
        System.out.println(countTime("2?:??"));
        System.out.println(countTime("?2:16"));
        System.out.println(countTime("?5:00"));
        System.out.println(countTime("0?:0?"));
        System.out.println(countTime("??:??"));
    }

    public static int countTime(String time) {
        int validTime = 1;
        if(time.charAt(0) == '?' && time.charAt(1) == '?'){
            validTime = validTime * 24;
        }else if(time.charAt(0) == '?' && time.charAt(1) != '?'){
            if(time.charAt(1) >= '3'){
                validTime = validTime * 2;
            }else {
                validTime = validTime * 3;
            }
        }else if(time.charAt(1) == '?' && time.charAt(0) != '?'){
            if(time.charAt(0) == '2'){
                validTime = validTime * 4;
            }else {
                validTime = validTime * 10;
            }
        }
        if(time.charAt(3) == '?' && time.charAt(4) == '?'){
            validTime = validTime * 60;
        }else if(time.charAt(3) == '?' && time.charAt(4) != '?'){
            validTime = validTime * 6;
        }else if(time.charAt(4) == '?' && time.charAt(3) != '?'){
            validTime = validTime * 10;
        }
        return validTime;
    }
}