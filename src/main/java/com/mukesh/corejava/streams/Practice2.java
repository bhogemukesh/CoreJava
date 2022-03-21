package com.mukesh.corejava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

/**
 * @author Mukesh Bhoge
 **/
public class Practice2 {

    public static void main(String[] args) {
        Practice2 p2 = new Practice2();
        // Count Empty String in Array
        p2.countEmptyString();
        //Count String whose length is more than three
        p2.countStringWhoseLengthIsMoreThanThree();
        //Count number of String which starts with "a"
        p2.countNumberOfStringStartWithH();
        //Remove all empty Strings from List
        p2.removeAllEmptyStringFromList();
        //Create a List with String more than 2 characters
        p2.createListWithStringMoreThanTwo();
        //Convert String to uppercase and Join them with coma
        p2.convertStringToUpperCaseAndJoinWithComma();
        //Create a List of the square of all distinct numbers
        p2.createListAndSquareDistinctNumber();
        //Get count, min, max, sum, and the average for numbers
        p2.getCountMinMaxSumAvg();

    }

    private void getCountMinMaxSumAvg() {
        int[] arr = {0, 1, 2, 3, 4, 2, 5};
        LongSummaryStatistics statistics = Arrays.stream(arr).mapToLong(x->x).summaryStatistics();
        System.out.println(statistics);
    }

    /**
     *
     */
    private void createListAndSquareDistinctNumber() {
        int[] arr = {-1, -2, 0, 1, 2, 3, 4, 2, 5};
        int[] squareArr = Arrays.stream(arr).map(x -> x * x).distinct().sorted().toArray();
        for (int i = 0; i < squareArr.length; i++) {
            System.out.print(squareArr[i] + ",");
        }
        System.out.println();
    }

    private void convertStringToUpperCaseAndJoinWithComma() {
        String[] arr = {"Hello", "hi", "Welcome", "Good Bye", "", "Test"};
        String str = Arrays.stream(arr).filter(x -> !x.isEmpty()).map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println("Final String " + str);
    }

    private void createListWithStringMoreThanTwo() {
        String[] arr = {"Hello", "hi", "Welcome", "Good Bye", "", "Test"};
        List<String> result = Arrays.stream(arr).filter(x -> x.length() > 2).collect(Collectors.toList());
        System.out.println("String having size more than 2 " + result);

    }

    private void removeAllEmptyStringFromList() {
        String[] arr = {"ABC", "", "PQ", "XYZ", "", ""};
        List<String> l1 = Arrays.stream(arr).filter(x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.println("List without Empty String " + l1);
    }

    private void countNumberOfStringStartWithH() {
        String[] arr = {"Hello", "hi", "Welcome", "Good Bye", "", "Test"};
        long count = Arrays.stream(arr).filter(x -> x.toLowerCase().startsWith("h")).count();
        System.out.println("Number of string start with h " + count);
    }

    private void countStringWhoseLengthIsMoreThanThree() {

        String[] arr = {"Hello", "hi", "Welcome", "Good Bye", "", "Test"};
        long count = Arrays.stream(arr).filter(x -> x.length() > 3).count();
        System.out.println("Total Number of String more than 3 length is :: " + count);
    }

    private void countEmptyString() {
        String[] arr = {"ABC", "", "PQ", "XYZ", "", ""};
        long emptyStringCount = Arrays.stream(arr).filter(x -> x.isEmpty()).count();
        System.out.println("Total Number of Empty String :: " + emptyStringCount);
    }
}
