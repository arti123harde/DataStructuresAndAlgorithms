package org.solutions.leetcode.string.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Arti Harde
 */
public class DesignUndergroundSystem {

    public static void main(String[] args) {
        DesignUndergroundSystem designUndergroundSystem = new DesignUndergroundSystem();
        designUndergroundSystem.checkIn(45,"Leyton",3);
        designUndergroundSystem.checkIn(32,"Paradise",8);
        designUndergroundSystem.checkIn(27,"Leyton",10);
        designUndergroundSystem.checkOut(45,"Waterloo",15);
        designUndergroundSystem.checkOut(27,"Waterloo",20);
        designUndergroundSystem.checkOut(32,"Cambridge",22 );
        System.out.println(designUndergroundSystem.getAverageTime("Paradise","Cambridge"));
        System.out.println(designUndergroundSystem.getAverageTime("Leyton","Waterloo" ));
        designUndergroundSystem.checkIn(10,"Leyton",24);
        System.out.println(designUndergroundSystem.getAverageTime("Leyton","Waterloo"));
        designUndergroundSystem.checkOut(10,"Waterloo",38);
        System.out.println(designUndergroundSystem.getAverageTime("Leyton","Waterloo"));
    }

    public DesignUndergroundSystem() {

    }

    private Map<Integer, Map<String, Double>> customerTime = new HashMap<>();
    private Map<String, Double> travelTime = new HashMap<>();
    private Map<String, Double> noOfTrips = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        if(!customerTime.containsKey(id)){
            customerTime.put(id, new HashMap<>());
        }
        customerTime.get(id).put(stationName, (double)t);
    }

    public void checkOut(int id, String stationName, int t) {
        if(!customerTime.containsKey(id)){
            customerTime.put(id, new HashMap<>());
        }
        customerTime.get(id).put(stationName, (double)t);
        List<String> s1 = new ArrayList<>(customerTime.get(id).keySet());
        String key = getKey(s1.get(0), s1.get(1));
        double currentTravelTime = Math.abs(customerTime.get(id).get(s1.get(1)) - customerTime.get(id).get(s1.get(0)));
        noOfTrips.put(key, noOfTrips.getOrDefault(key, 0.0000) + 1);
        if(!travelTime.containsKey(key)){
            travelTime.put(key, currentTravelTime);
        }else{
            travelTime.put(key, travelTime.get(key) + currentTravelTime);
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = getKey(startStation, endStation);
        double t = travelTime.get(key) / noOfTrips.get(key);
        System.out.println("Key : " + key + " Time : " + t);
        return t;
    }

    public String getKey(String s1, String s2){
        return s1.compareTo(s2) > 0 ? s2 + "_" + s1 : s1 + "_" + s2 ;
    }
}