package org.solutions.string;

public class ReverseStringArray {

    public static void main(String[] args) {
        char[] c = {'h','e','l','l','o'};
        reverseString(c);
        printArray(c);
        char[] c1 = {'H','a','n','n','a','h'};
        reverseString(c1);
        printArray(c1);
    }

    public static void reverseString(char[] s) {
        char temp;
        for (int i=0,j=s.length-1; i<j; i++,j--){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    public static void printArray(char[] array){
        for(char i : array){
            System.out.print(i);
        }
        System.out.println();
    }
}
