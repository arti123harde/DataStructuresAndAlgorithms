package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class MaximumNumberOfBalloons {

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("leetcode"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }

    public static int maxNumberOfBalloons(String text) {
        int count = 0;
        int[] chars = new int[26];
        for(char c : text.toCharArray()){
            chars[c - 'a'] = chars[c - 'a'] + 1;
        }
        for(int i=1; i<=chars[1]; i++){
            if(chars[0] >= i && chars['l'-'a'] >= i*2 && chars['o'-'a'] >= i*2 && chars['n'-'a'] >= i){
                count++;
            }
        }
        return count;
    }
}