package org.solutions.string;

public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(9));
        System.out.println(countAndSay(10));
    }
    private static String countAndSay(int n) {
        StringBuilder result = new StringBuilder();
        String s = "1";
        int start = 2;
        if(n == 1){
            result.append(s);
        }else{
            while(start <= n){
                result = new StringBuilder();
                int count = 0;
                char say = s.charAt(0);
                for(int i=0; i<s.length(); i++){
                    if(say == s.charAt(i)){
                        count++;
                    } else{
                        result.append(count);
                        result.append(say);
                        say = s.charAt(i);
                        count = 1;
                    }
                    if(i+1 == s.length()){
                        result.append(count);
                        result.append(say);
                    }
                }
                s = result.toString();
                start++;
            }
        }
        return result.toString();
    }
}
