package org.solutions.string;

import java.util.Objects;

public class MultiplyStrings {

    /**
     * Given two non-negative integers num1 and num2 represented as strings,
     * return the product of num1 and num2, also represented as a string.
     * <p>
     * Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
     */
    public static void main(String[] args) {
        System.out.println(multiply("20", "30"));
        System.out.println(multiply("123", "456"));
    }

    private static String multiply(String num1, String num2){
        StringBuilder result = new StringBuilder();
        if(Objects.equals(num1, "0") || Objects.equals(num2, "0")){
            result = new StringBuilder("0");
        }else{
            int product = 0;
            int div = 0;
            int rem = 0;
            int[] results = new int[num1.length() + num2.length()];
            for(int i=num1.length()-1; i>=0; i--){
                for(int j=num2.length()-1; j>=0; j--){
                    product = (num1.charAt(i) - '0') *  (num2.charAt(j) - '0');
                    results[i+j+1] = results[i+j+1] + product;
                    rem = results[i+j+1] % 10;
                    div = results[i+j+1] / 10;
                    results[i+j+1] = rem;
                    results[i+j] = results[i+j] + div;
                }
            }
            for (int r : results){
                if(result.length() == 0 && r==0){
                    continue;
                }
                result.append(r);
            }
        }
        return result.toString();
    }
}
