package com.mukesh.corejava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author mukesh_bhoge
 * This Example will help to understand map concept
 * Many Developers get confused with word .map() method with Map interface and hashmap.
 * But here .map() method means mapping the result with expected result from existing collection
 * .map(Function) in streams is accepting Predicate always.
 * It can accept any operation.So to perform any operation use map
 * stream.map(function)
 * Problem Statement: Double the every number from list and create (map) it to new list
 */

public class DoubleNumberInList {

    public static void main(String[] args) {
        DoubleNumberInList doubleNumberInList = new DoubleNumberInList();
        List<Integer> numbersList = doubleNumberInList.createIntegerList();
        // Get List of Even numbers using Streams Filter
        List<Integer> doubleNumbersList = numbersList.stream().map(iNum -> iNum * 2).collect(Collectors.toList());
        System.out.println("Original numbersList :: " + numbersList);
        System.out.println("Using Streams doubleNumbersList :: " + doubleNumbersList);
    }

    /**
     * Create raw data for test
     *
     * @return
     */
    private List<Integer> createIntegerList() {
        int[] input = new int[]{0, 1, 2, 3, 4, 10, 11, 13, 15, 20, 26, 100};
        List<Integer> numbersList = new ArrayList<Integer>();
        for (int value : input) {
            numbersList.add(value);
        }
        return numbersList;
    }
}
