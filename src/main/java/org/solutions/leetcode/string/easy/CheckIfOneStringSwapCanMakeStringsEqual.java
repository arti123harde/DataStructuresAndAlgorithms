package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class CheckIfOneStringSwapCanMakeStringsEqual {

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
        System.out.println(areAlmostEqual("attack", "defend"));
        System.out.println(areAlmostEqual("kelb", "kelb"));
        System.out.println(areAlmostEqual("caa", "aaz"));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        char ch = 0;
        int index = -1;
        for(int i=0; i<s2.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(ch == 0 && index == -1){
                    ch = s1.charAt(i);
                    index = i;
                }else {
                    char[] c = s2.toCharArray();
                    c[i] = s2.charAt(index);
                    c[index] = s2.charAt(i);
                    return new String(c).equals(s1);
                }
            }
        }
        return count == 0;
    }
}