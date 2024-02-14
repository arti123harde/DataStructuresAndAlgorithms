package org.solutions.math;

public class ConvertIntegerToBinary {

    public static void main(String[] args) {
        convertToBinary(10);
    }

    public static void convertToBinary(int n){
        StringBuilder s = new StringBuilder();
        int mod = n;
        int reminder;
        while (mod != 0){
            reminder = mod % 2;
            mod = mod/2;
            s.append(reminder);
        }
        System.out.println("Binary of " + n + " : " + s.reverse().toString());
    }
}
