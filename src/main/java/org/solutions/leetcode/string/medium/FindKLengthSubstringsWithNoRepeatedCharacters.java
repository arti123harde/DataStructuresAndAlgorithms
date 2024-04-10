package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class FindKLengthSubstringsWithNoRepeatedCharacters {

    public static void main(String[] args) {
        System.out.println(numKLenSubstrNoRepeats("havefunonleetcode", 5));
        System.out.println(numKLenSubstrNoRepeats("home", 5));
    }

    public static int numKLenSubstrNoRepeats(String s, int k) {
        if(s.length() < k){
            return 0;
        }else {
            int count = 0;
            for(int i=0; i<s.length(); i++){
                if(i+k <= s.length()){
                    boolean isRepeated = false;
                    String s1 = s.substring(i, i+k);
                    for(int j=0; j<s1.length(); j++){
                        if(s1.substring(j+1).contains(String.valueOf(s1.charAt(j)))){
                            isRepeated = true;
                            break;
                        }
                    }
                    if(!isRepeated){
                        count++;
                    }
                }
            }
            return count;
        }
    }
}