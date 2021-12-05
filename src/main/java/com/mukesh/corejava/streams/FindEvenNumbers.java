package com.mukesh.corejava.streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This Example will help to understand filter concept
 * Problem Statement: From Given Integer ArrayList find out even number
 */
public class FindEvenNumbers {


    public static void main(String[] args) {
        FindEvenNumbers findEvenNumbers = new FindEvenNumbers();
        List<Integer> numbersList = findEvenNumbers.createIntegerList();
        List<Integer> evenNumList = findEvenNumbers.getEvenNumbersUsingForEach(numbersList);
        System.out.println("Using ForEach :: " + evenNumList);

        // Get List of Even numbers using Streams Filter
        List<Integer> evenNumListFromStreams = numbersList.stream().filter(iNum -> iNum % 2 == 0).collect(Collectors.toList());
        System.out.println("Using Streams :: " + evenNumListFromStreams);
    }

    /**
     * Get Even Numbers Using ForEach Look and conditional Check
     *
     * @param numbersList
     * @return
     */
    private List<Integer> getEvenNumbersUsingForEach(List<Integer> numbersList) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer iNum : numbersList) {
            if (iNum % 2 == 0) {
                evenNumbers.add(iNum);
            }
        }
        return evenNumbers;
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
