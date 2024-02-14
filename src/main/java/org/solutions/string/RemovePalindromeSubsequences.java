package org.solutions.string;

public class RemovePalindromeSubsequences {

    public static void main(String[] args) {
        System.out.println(removePalindromeSub("ababa"));
        System.out.println(removePalindromeSub("ababbbaaba"));
        System.out.println(removePalindromeSub("baabb"));
    }

    public static int removePalindromeSub(String s) {
        if(s.length()==0)
            return 0;
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return 2;
        return 1;
    }

    public static int removePalindromeSub1(String s) {
        int count = 0;
        int i = 0;
        int l = 0;
        while(i<s.length()){
            l = findPalindromeIndex(s, i);
            if(l == 0){
                i++;
            }else {
                i = i + l;
            }
            count++;
        }
        return count;
    }

    public static int findPalindromeIndex(String s, int startIndex){
        int i = startIndex;
        int l = 0;
        while (i < s.length()+1){
            String s1 = s.substring(startIndex, i);
            if(s1.equals(new StringBuffer(s1).reverse().toString()) && l<s1.length()){
                l = s1.length();
            }
            i++;
        }
        return l;
    }
}
