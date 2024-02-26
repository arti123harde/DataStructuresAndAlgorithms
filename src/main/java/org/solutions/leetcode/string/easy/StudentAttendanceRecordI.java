package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class StudentAttendanceRecordI {

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
    }

    public static boolean checkRecord(String s) {
        boolean eligible = true;
        if(s.contains("LLL")){
            eligible = false;
        }else{
            int count = 0;
            for(char c : s.toCharArray()){
                if(c == 'A'){
                    count++;
                }
                if(count >= 2){
                    eligible = false;
                    break;
                }
            }
        }
        return eligible;
    }
}