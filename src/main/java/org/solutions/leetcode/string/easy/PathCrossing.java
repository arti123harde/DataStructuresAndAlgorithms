package org.solutions.leetcode.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class PathCrossing {

    public static void main(String[] args) {
        System.out.println(isPathCrossing("NESWW"));
        System.out.println(isPathCrossing("NES"));
    }

    public static boolean isPathCrossing(String path) {
        Map<Character, List<Integer>> coordinates = new HashMap<>();
        coordinates.put('N', Arrays.asList(0,1));
        coordinates.put('S', Arrays.asList(0,-1));
        coordinates.put('E', Arrays.asList(1,0));
        coordinates.put('W', Arrays.asList(-1,0));
        List<List<Integer>> visitedNodes = new ArrayList<>();
        visitedNodes.add(Arrays.asList(0,0));
        for(char move : path.toCharArray()){
            if(visitedNodes.size() == 1){
                visitedNodes.add(coordinates.get(move));
            }else{
                int currentX = visitedNodes.get(visitedNodes.size()-1).get(0) + coordinates.get(move).get(0);
                int currentY = visitedNodes.get(visitedNodes.size()-1).get(1) + coordinates.get(move).get(1);
                List<Integer> currentNode = Arrays.asList(currentX, currentY);
                if(visitedNodes.contains(currentNode)){
                    return true;
                }else {
                    visitedNodes.add(currentNode);
                }
            }
        }
        return false;
    }
}