package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ValidWordAbbreviation {

    public static void main(String[] args) {
        System.out.println(validWordAbbreviation("hi", "2i"));
        System.out.println(validWordAbbreviation("internationalization", "i5a11o1"));
        System.out.println(validWordAbbreviation("internationalization", "i12iz4n"));
        System.out.println(validWordAbbreviation("apple", "a2e"));
    }

    public static boolean validWordAbbreviation(String word, String abbr) {
        int index = 0;
        int i = 0;
        while (i < abbr.length()){
            if(Character.isDigit(abbr.charAt(i))){
                if(abbr.charAt(i) == '0'){
                    return false;
                }else {
                    StringBuilder d = new StringBuilder();
                    while(i < abbr.length() && Character.isDigit(abbr.charAt(i))){
                        d.append(abbr.charAt(i));
                        i++;
                    }
                    index = index + Integer.parseInt(d.toString());
                }
            }else if(Character.isLetter(abbr.charAt(i))){
                if(index >= word.length()){
                    return false;
                }else if(abbr.charAt(i) != word.charAt(index)){
                    return false;
                }else {
                    i++;
                    index++;
                }
            }
        }
        return word.length() == index;
    }
}