package org.solutions.leetcode.string.easy;

/**
 * @author Arti Harde
 */
public class ShortestDistanceToTargetStringInACircularArray {

    public static void main(String[] args) {
        System.out.println(closetTarget(new String[]{"hello","i","am","leetcode","hello"},
                "hello", 1));
        System.out.println(closetTarget(new String[]{"hsdqinnoha","mqhskgeqzr","zemkwvqrww","zemkwvqrww",
                        "daljcrktje","fghofclnwp","djwdworyka","cxfpybanhd","fghofclnwp","fghofclnwp"},
                "zemkwvqrww", 8));
        System.out.println(closetTarget(new String[]{"i","eat","leetcode"},
                "ate", 0));
    }

    public static int closetTarget(String[] words, String target, int startIndex) {
        if(words[startIndex].equals(target)){
            return 0;
        }else{
            int count = 0;
            int shortDistance = Integer.MAX_VALUE;
            int prev = (startIndex - 1 + words.length) % words.length;
            int next = (startIndex + 1) % words.length;
            while (count < words.length){
                count++;
                if(words[prev].equals(target) || words[next].equals(target)){
                    shortDistance = count;
                    break;
                }
                prev = (prev - 1 + words.length) % words.length;
                next = (next + 1) % words.length;
            }
            return shortDistance == Integer.MAX_VALUE ? -1 : shortDistance;
        }
    }
}