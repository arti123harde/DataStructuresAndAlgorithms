package org.dsa.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Arti Harde
 */
public class MatcherDemo {

    public static void main(String args[]) {

        Pattern pattern = Pattern.compile("Geeks");
        Matcher m = pattern.matcher("GeeksForGeeksIsGeeksOrGeeks");
        System.out.println(m.matches());
        System.out.println(m.groupCount());
        while (m.find())
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
    }
}