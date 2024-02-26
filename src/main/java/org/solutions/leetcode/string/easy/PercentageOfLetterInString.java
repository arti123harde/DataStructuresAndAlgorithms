package org.solutions.leetcode.string.easy;

import java.time.Instant;

public class PercentageOfLetterInString {

    public static void main(String[] args) {
        long start = Instant.now().toEpochMilli();
        System.out.println(percentageLetter1( "foobar", 'o'));
        System.out.println("TotalTime algo 1 " + (Instant.now().toEpochMilli()-start));
        start = Instant.now().toEpochMilli();
        System.out.println(percentageLetter2( "jjjj", 'j'));
        System.out.println("TotalTime algo 2 " + (Instant.now().toEpochMilli()-start));
    }

    public static int percentageLetter1(String s, char letter) {
        int count = (int)s.chars().filter(c -> c==letter).count();
        return (count * 100)/s.length();
    }

    public static int percentageLetter2(String s, char letter) {
        double count = 0;
        for (char i : s.toCharArray()) {
            if (i == letter) count++;
            else continue;
        }
        double result = (count / s.length()) * 100;
        return (int) result;
    }
}
