package org.dsa.math;

public class AssignmentOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 2121;
        printXORResult(a, b);
    }

    /**
     * XOR -  returns true, if values are different else return false if values are same
     * 10 = 1010 (in binary)
     * 2121 = 100001001001 (in binary)
     */
    private static void printXORResult(int a, int b){
        int result = a ^ b;
        System.out.println("XOR of a = " + a + " and b = " + b + " : " + result);
    }

}
