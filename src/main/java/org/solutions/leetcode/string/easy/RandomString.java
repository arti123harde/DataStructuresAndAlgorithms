package org.solutions.leetcode.string.easy;

import java.util.Random;

public class RandomString {

    private static String getSaltString() {
        String SALTCHARS = "qwertyuioplkjhgfdsazxcvbnm1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 7) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();
    }

    public static void main(String[] args) {
        System.out.println(getSaltString());
    }
}
