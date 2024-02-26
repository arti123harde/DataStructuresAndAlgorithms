package org.solutions.leetcode.string.easy;

public class DefangedIPAddress {

    public static void main(String[] args) {
        System.out.println(defangedIPAddress("1.1.1.1"));
        System.out.println(defangedIPAddress1("255.100.50.0"));
    }

    private static String defangedIPAddress(String s){
        return s.replace(".", "[.]");
    }

    private static String defangedIPAddress1(String s){
        return s.replaceAll("\\.", "[.]");
    }
}
