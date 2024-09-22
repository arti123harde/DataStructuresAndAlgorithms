package org.dsa.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @author Arti Harde
 */
public class PatternSyntaxExceptionDemo {

    public static void main(String[] args) {

        try {
            String REGEX = "?[^a-zA-Z0-9]";
            String MSG = "Learn/ java? in GeeksforGeeks!!";
            String REPLACE = " ";
            Pattern pattern = Pattern.compile(REGEX);
            Matcher matcher = pattern.matcher(MSG);
            MSG = matcher.replaceAll(REPLACE);
            System.out.println(MSG);
        } catch (PatternSyntaxException pse) {
            System.out.println("PatternSyntaxException: ");
            System.out.println("Description: " + pse.getDescription());
            System.out.println("Index: " + pse.getIndex());
            System.out.println("Message: " + pse.getMessage());
            System.out.println("Pattern: " + pse.getPattern());
            System.exit(0);
        }
    }

}