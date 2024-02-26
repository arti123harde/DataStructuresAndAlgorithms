package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ReplaceAllQuestionMarksAvoidConsecutiveRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(modifyString("j?qg??b"));
        System.out.println(modifyString("?zs"));
        System.out.println(modifyString("ubv?w"));
    }

    public static String modifyString(String s) {
        char[] chars = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            chars[i] = s.charAt(i);
        }
        for(int i=0 ; i<chars.length; i++){
            if(chars[i] == '?'){
                char prev = 0;
                char next = 0;
                if(i > 0){
                    prev = chars[i-1];
                }
                if(i < chars.length-1){
                    next = chars[i+1];
                }
                chars[i] = findNextCharacter(prev, next);
            }
        }
        return new String(chars);
    }

    public static char findNextCharacter(char prev, char next){
        char current = 0;
        for(char i='a'; i<='z'; i++){
            if(prev != 0 && prev != i && next != 0 && next != i){
                current = i;
                break;
            } else if (prev != 0 && prev != i && next == 0) {
                current = i;
                break;
            }else if (next != 0 && next != i && prev == 0){
                current = i;
                break;
            }else if(prev == 0 && next == 0){
                current = i;
                break;
            }
        }
        return current;
    }
}