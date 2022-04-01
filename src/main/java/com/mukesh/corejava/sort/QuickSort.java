package com.mukesh.corejava.sort;

import java.sql.Array;
import java.util.Random;

/**
 * @author Mukesh Bhoge
 * Here we will select Pivote first and then will move the smaller elements to left and larger to right
 * And then recursively keep calling quicksort method
 **/
public class QuickSort {

    public static void main(String[] args) {
        Random random = new Random();
        int [] randomNumbers = new int [10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        randomNumbers = quickSort(randomNumbers);
    }

    private static int[] quickSort(int[] randomNumbers) {
        return quickSort(randomNumbers,0,randomNumbers.length);
    }

    private static int[] quickSort(int[] randomNumbers, int lowerIndex, int highestIndex) {

        int leftPointer = lowerIndex;
        int rightPointer = highestIndex;
        int pivot = randomNumbers[highestIndex];

        while(leftPointer < rightPointer){

        }
    }
}
