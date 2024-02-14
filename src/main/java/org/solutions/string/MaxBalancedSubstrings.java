package org.solutions.string;

public class MaxBalancedSubstrings {

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }

    public static int balancedStringSplit(String s){
        int count = 0;
        int lcount = 0;
        int rcount = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                lcount ++;
            }else {
                rcount ++;
            }
            if((i+1)%2==0 && (lcount == rcount)){
                count ++;
                lcount = 0;
                rcount = 0;
            }
        }
        return count;
    }
}
