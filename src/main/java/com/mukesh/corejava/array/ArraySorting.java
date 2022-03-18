package com.mukesh.corejava.array;

/**
 * @author Mukesh Bhoge
 **/
public class ArraySorting {
    public static void main(String[] args) {
        int[] input = {5, 2, 1, 0, 4, 3};
        int[] sortedArray = sortArray(input);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + ", ");
        }
        findMinimumAndMaximumNumber(sortedArray);

    }

    private static void findMinimumAndMaximumNumber(int[] sortedArray) {
        System.out.println("Minimum Number : "+sortedArray[0]);
        System.out.printf("Maximum Number: "+sortedArray[sortedArray.length-1]);
    }

    private static int[] sortArray(int[] input) {
        int temp = 0;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        return input;
    }
}
