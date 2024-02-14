package org.solutions.string;

public class FirstOccurrenceIndex {

    /**
     * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
     * or -1 if needle is not part of haystack.
     * <p>
     * Example 1:
     * Input: haystack = "sadbutsad", needle = "sad"
     * Output: 0
     * Explanation: "sad" occurs at index 0 and 6.
     * The first occurrence is at index 0, so we return 0.
     * <p>
     * Example 2:
     * Input: haystack = "leetcode", needle = "leeto"
     * Output: -1
     * Explanation: "leeto" did not occur in "leetcode", so we return -1.
     */
    public static void main(String[] args) {
        System.out.println(findOccurrence("sadbutsad", "sad"));
        System.out.println(findOccurrence("leetcode", "code"));
        System.out.println(findOccurrence("Shivrrramramshiv", "ram"));
        System.out.println(findOccurrence("ram", "ram"));
    }

    private static int findOccurrence(String haystack, String needle){
        int index = -1;
        if(validateInput(haystack) && validateInput(needle) && (needle.length() <= haystack.length())){
            for(int i=0; i<=(haystack.length()-needle.length()); i++){
                if(needle.equals(haystack.substring(i, i+needle.length()))){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    private static boolean validateInput(String str){
        return 1 <= str.length() && str.length() <= Math.pow(10, 4);
    }
}
