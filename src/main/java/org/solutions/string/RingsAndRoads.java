package org.solutions.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RingsAndRoads {

    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
        System.out.println(countPoints( "B0R0G0R9R0B0G0"));
        System.out.println(countPoints( "G4"));
    }

    public static int countPoints(String s) {
        HashMap<Character, Set<Character>> hashMap = new HashMap<>();
        for(int i=0; i<s.length(); i=i+2){
            if(!hashMap.containsKey(s.charAt(i+1))){
                hashMap.put(s.charAt(i+1), new HashSet<>());
            }
            hashMap.get(s.charAt(i+1)).add(s.charAt(i));
        }
        return (int) hashMap.entrySet().stream().filter(h -> h.getValue().size()==3).count();
    }
}
