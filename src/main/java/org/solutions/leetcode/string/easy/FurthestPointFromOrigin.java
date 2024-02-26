package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class FurthestPointFromOrigin {

    public static void main(String[] args) {
        System.out.println(furthestDistanceFromOrigin("L_RL__R"));
        System.out.println(furthestDistanceFromOrigin("_R__LL_"));
        System.out.println(furthestDistanceFromOrigin("_______"));
        System.out.println(furthestDistanceFromOrigin("R_"));
    }

    public static int furthestDistanceFromOrigin(String moves) {
        int count = 0;
        int sameMove = 0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'L'){
                count--;
            }else if(moves.charAt(i) == 'R'){
                count++;
            }else if(moves.charAt(i) == '_'){
                sameMove++;
            }
        }
        return Math.abs(count) + sameMove;
    }

}