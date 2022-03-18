package com.mukesh.corejava.array;

import java.util.Arrays;

/**
 * @author Mukesh Bhoge
 **/
public class SquareElementsAndPrintInSortedOrder {

    public static void main(String[] args) {
        // Input : [-2, -1, 0, 2, 3]
        // Output : [0, 1, 4, 4, 9]
        int[] arr = {-2, -1, 0, 2, 3};
        //printUsingStreams(arr);
        sortArray(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ", ");
//        }
    }

    private static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
    }

//    private static void printUsingStreams(int[] arr) {
//        int[] sortedSquare = Arrays.stream(arr).map(iNum -> iNum * iNum).sorted().toArray();
//        for (int i = 0; i < sortedSquare.length; i++) {
//            System.out.print(sortedSquare[i] + ", ");
//        }
//        System.out.println();
//    }
}
