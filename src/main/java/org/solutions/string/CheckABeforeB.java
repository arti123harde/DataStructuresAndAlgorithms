package org.solutions.string;

import java.util.regex.Pattern;

public class CheckABeforeB {

    public static void main(String[] args) {
        System.out.println(checkString("aaabbb"));
        System.out.println(checkString("abab"));
        System.out.println(checkString("bbb"));
    }

    public static boolean checkString(String s) {
        Pattern regex = Pattern.compile("^(a*)(b*)$");
        return regex.matcher(s).find();
    }
}
