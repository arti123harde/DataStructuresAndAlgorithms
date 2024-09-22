package org.dsa.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Arti Harde
 */
public class MatcherGroupDemo {
    public static void main(String[] args) {
        String REGEX = "(a*b)(foo)(xyz)";
        String INPUT = "aabfooxyzaabfooxyzaabfooaaaaaaabfooxyz";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        System.out.println("Group Count: "+matcher.groupCount());
        while(matcher.find()) {
            System.out.println("Group: " + matcher.group());
        }
    }
}