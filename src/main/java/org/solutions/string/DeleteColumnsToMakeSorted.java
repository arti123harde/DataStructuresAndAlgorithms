package org.solutions.string;

public class DeleteColumnsToMakeSorted {

    public static void main(String[] args) {
        System.out.println(minDeletionSize(new String[]{"cba","daf","ghi"}));
        System.out.println(minDeletionSize(new String[]{"a","b"}));
        System.out.println(minDeletionSize(new String[]{"zyx","wvu","tsr"}));
    }

    public static int minDeletionSize(String[] strs) {
        int count = 0;
        int len = strs[0].length();
        for(int i=0; i<len; i++){
            for(int j=0; j<strs.length-1; j++){
                if(strs[j].charAt(i) > strs[j+1].charAt(i)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
