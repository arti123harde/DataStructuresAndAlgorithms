package org.solutions.leetcode.string.easy;

public class CountAsterisks {

    public static void main(String[] args) {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));
        System.out.println(countAsterisks("iamprogrammer"));
        System.out.println(countAsterisks("|**|*|*|**||***||"));
        System.out.println(countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }

    public static int countAsterisks(String s) {
        int count = 0;
        String[] strings = s.split("\\|");
        for(int i=0; i<strings.length; i=i+2){
            count = count + strings[i].replaceAll("\\.*[a-z]", "").length();
        }
        return count;
    }
}
