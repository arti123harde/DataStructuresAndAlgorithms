package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class LatestTimeByReplacingHiddenDigits {

    public static void main(String[] args) {
        System.out.println(maximumTime("2?:?0"));
        System.out.println(maximumTime("0?:3?"));
        System.out.println(maximumTime("1?:22"));
    }

    public static String maximumTime(String time) {
        char[] t = time.toCharArray();
        if(t[0] == '?' && t[1] == '?'){
            t[0] = '2';
            t[1] = '3';
        }else if(t[0] == '?' && t[1] != '?'){
            if(t[1] > '3'){
                t[0] = '1';
            }else {
                t[0] = '2';
            }
        }else if(t[1] == '?' && t[0] != '?'){
            if(t[0] == '2'){
                t[1] = '3';
            }else {
               t[1] = '9';
            }
        }
        if(t[3] == '?' && t[4] == '?'){
            t[3] = '5';
            t[4] = '9';
        }else if(t[3] == '?' && t[4] != '?'){
            t[3] = '5';
        }else if(t[4] == '?' && t[3] != '?'){
            t[4] = '9';
        }
        return new String(t);
    }
}