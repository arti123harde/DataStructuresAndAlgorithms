package org.solutions.leetcode.string.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class LetterTilePossibilities {

    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));
        System.out.println(numTilePossibilities("AAABBC"));
    }

    public static int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        boolean[] vis = new boolean[tiles.length()];
        permute(tiles, "", set, vis);
        System.out.println(set);
        return set.size()-1;
    }
    public static void permute(String tiles, String curr, Set<String> set, boolean[] vis){
        set.add(curr);
        for(int i=0; i<tiles.length(); i++){
            if(!vis[i]){
                vis[i]=true;
                permute(tiles, curr+tiles.charAt(i), set, vis);
                vis[i]=false;
            }
        }
    }
}