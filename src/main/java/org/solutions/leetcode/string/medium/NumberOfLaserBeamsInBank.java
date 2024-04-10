package org.solutions.leetcode.string.medium;

/**
 * @author Arti Harde
 */
public class NumberOfLaserBeamsInBank {

    public static void main(String[] args) {
        System.out.println(numberOfBeams(new String[]{"1","1"}));
        System.out.println(numberOfBeams(new String[]{"011001","000000","010100","001000"}));
        System.out.println(numberOfBeams(new String[]{"000","111","000"}));
    }

    public static int numberOfBeams(String[] bank) {
        if(bank.length < 2){
            return 0;
        }else{
            int count = 0;
            int i = 0;
            while(i < bank.length){
                int countI = 0;
                for(char c : bank[i].toCharArray()){
                    if(c == '1'){
                        countI++;
                    }
                }
                int nextIndex = -1;
                if(countI != 0){
                    for(int j=i+1; j<bank.length; j++){
                        int countJ = 0;
                        for(char c : bank[j].toCharArray()){
                            if(c == '1'){
                                countJ++;
                            }
                        }
                        if(countJ != 0){
                            count = count + (countI * countJ);
                            nextIndex = j;
                            j = bank.length;
                        }
                    }
                }
                i = nextIndex != -1 ? nextIndex : ++i;
            }
            return count;
        }
    }
}