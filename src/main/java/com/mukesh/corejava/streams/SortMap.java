package com.mukesh.corejava.streams;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mukesh Bhoge
 **/
public class SortMap {
    public static void main(String[] args) {
        Map<String, Integer> tempMap = new HashMap<>();
        tempMap.put("Eight", 8);
        tempMap.put("One", 1);
        tempMap.put("Three", 3);
        tempMap.put("Six", 6);
        tempMap.put("Ten", 10);

        tempMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("==================");
        tempMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
