package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class LicenseKeyFormatting {

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("--a-a-a-a--", 2));
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
    }

    public static String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "").toUpperCase();
        StringBuilder stringBuilder = new StringBuilder();
        int index = s.length() - 1;
        while(index >= 0){
            if(index >= k){
                stringBuilder.insert(0, s.substring(index - k + 1, index + 1)).insert(0, "-");
            }else {
                stringBuilder.insert(0, s.substring(0, index + 1));
            }
            index = index - k;
        }
        return stringBuilder.toString();
    }

    public static String licenseKeyFormatting1(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        int index = s.length()-1;
        while(index >= 0){
            if(Character.isLetterOrDigit(s.charAt(index))){
                stringBuilder.insert(0, s.charAt(index));
                count++;
            }
            if(count == k){
                stringBuilder.insert(0, "-");
                count = 0;
            }
            index--;
        }
        String s1 = stringBuilder.toString().toUpperCase();
        return s1.startsWith("-") ? s1.substring(1 ) : s1;
    }
}