package org.solutions.string;

public class MaxPalindromeAfterOperations {

    public static void main(String[] args) {
//        System.out.println(maxPalindromesAfterOperations(new String[]{"abbb","ba","aa"}));
//        System.out.println(maxPalindromesAfterOperations(new String[]{"abc","ab"}));
//        System.out.println(maxPalindromesAfterOperations(new String[]{"cd","ef","a"}));
        System.out.println(maxPalindromesAfterOperations(new String[]{"cgh","h"}));
    }

    public static int maxPalindromesAfterOperations(String[] words) {
        int maxPalindrome = 0;
        for(int i=0; i<words.length; i++){
            for(int j=0; j<words.length; j++){
                for(int x=0; x<words[i].length(); x++){
                    for(int y=0; y<words[j].length(); y++){
                        char temp = words[i].charAt(x);
                        char[] chars1 = words[i].toCharArray();
                        chars1[x] = words[j].charAt(y);
                        words[i] = new String(chars1);
                        char[] chars2 = words[j].toCharArray();
                        chars2[y] = temp;
                        words[j] = new String(chars2);
                        System.out.println(words[0] + " , " + words[1]);
                        int count = checkPalindromeCount(words);
                        if(count > maxPalindrome){
                            maxPalindrome = count;
                        }
                    }
                }
            }
        }
        return maxPalindrome;
    }

    private static int checkPalindromeCount(String[] words){
        int count = 0;
        for (String word : words) {
            if (word.equals(new StringBuffer(word).reverse().toString())) {
                count++;
            }
        }
        return count;
    }
}
