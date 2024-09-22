package org.dsa.regex;

import java.util.regex.Pattern;

/**
 * @author Arti Harde
 */
public class PattenClassDemo {
    public static void main(String args[]) {
        System.out.println(Pattern.matches("geeksforge*ks", "geeksforgeeks"));
        Pattern pattern = Pattern.compile("g*geeks");
        System.out.println(pattern.matcher("geeksfor").matches());
        System.out.println(pattern.matcher("gygeeks").pattern());
        String[] array = pattern.split("ggeeksforsgugeekstjkgygeeksb");
        for(String s : array){
            System.out.println(s);
        }
        String[] array1 = pattern.split("ggeeksforsgugeekstjkgygeeksb", 3);
        for(String s : array1){
            System.out.println(s);
        }
    }
}