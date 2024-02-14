package org.solutions.string;

import java.util.List;
import java.util.stream.Collectors;

public class RobotReturnOrigin {

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
        System.out.println(judgeCircle("ULDR"));
    }

    public static boolean judgeCircle(String moves) {
        int u = 0;
        int d = 0;
        int l = 0;
        int r = 0;
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                u++;
            }else if(moves.charAt(i) == 'D'){
                d++;
            }else if(moves.charAt(i) == 'L'){
                l++;
            }else if(moves.charAt(i) == 'R'){
                r++;
            }
        }
        return (u==d) && (l==r);
    }

    public static boolean judgeCircle1(String moves) {
        List<Character> chars = moves.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
        int u = (int)chars.stream().filter(character -> character.equals('U')).count();
        int d = (int)chars.stream().filter(character -> character.equals('D')).count();
        int l = (int)chars.stream().filter(character -> character.equals('L')).count();
        int r = (int)chars.stream().filter(character -> character.equals('R')).count();
        return (u==d) && (l==r);
    }

}
