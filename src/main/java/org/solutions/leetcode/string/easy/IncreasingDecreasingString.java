package org.solutions.leetcode.string.easy;

public class IncreasingDecreasingString {

    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
        System.out.println(sortString("ccaabb"));
        System.out.println(sortString("rat"));
    }

    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        char temp;
        boolean small = true;
        boolean large = true;
        while (i < chars.length){
            int sm = findSmallestElement(chars, i);
            if(sm != -1){
                temp = chars[i];
                chars[i] = chars[sm];
                chars[sm] = temp;
                i++;
            }
            while (small && i < chars.length){
                int smallIndex = findSmallestCharacter(chars, chars[i-1], i);
                if(smallIndex != -1){
                    temp = chars[i];
                    chars[i] = chars[smallIndex];
                    chars[smallIndex] = temp;
                    i++;
                }else{
                    small = false;
                }
            }
            int lg = findLargestElement(chars, i);
            if(lg != -1){
                temp = chars[i];
                chars[i] = chars[lg];
                chars[lg] = temp;
                i++;
            }
            while (large && i < chars.length){
                int largeIndex = findLargestCharacter(chars, chars[i-1], i);
                if(largeIndex != -1){
                    temp = chars[i];
                    chars[i] = chars[largeIndex];
                    chars[largeIndex] = temp;
                    i++;
                }else{
                    large = false;
                }
            }
            small = true;
            large = true;
        }
        return new String(chars);
    }

    public static int findSmallestElement(char[] chars, int i){
        char smallChar = '{';
        int smallIndex = -1;
        for(int j=i; j<chars.length; j++){
            if(chars[j] < smallChar){
                smallChar = chars[j];
                smallIndex = j;
            }
        }
        return smallIndex;
    }

    public static int findLargestElement(char[] chars, int i){
        char largeChar = '.';
        int largeIndex = -1;
        for(int j=i; j<chars.length; j++){
            if(chars[j] > largeChar){
                largeChar = chars[j];
                largeIndex = j;
            }
        }
        return largeIndex;
    }

    public static int findSmallestCharacter(char[] chars, char c, int i){
        int smallIndex = -1;
        char smallChar = '{';
        for(int j=i; j<chars.length; j++){
            if(chars[j] > c){
                if(chars[j] < smallChar){
                    smallChar = chars[j];
                    smallIndex = j;
                }
            }
        }
        return smallIndex;
    }

    public static int findLargestCharacter(char[] chars, char c, int i){
        int largeIndex = -1;
        char largeChar = '.';
        for(int j=i; j<chars.length; j++){
            if(chars[j] < c){
                if(chars[j] > largeChar){
                    largeChar = chars[j];
                    largeIndex = j;
                }
            }
        }
        return largeIndex;
    }
}

