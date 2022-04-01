package com.mukesh.corejava.sort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Mukesh Bhoge
 * Here time complexity is  O(n^2)
 * 1)START
 * 2)Run two loops – an inner loop and an outer loop.
 * 3)Repeat steps till the outer loop are exhausted.
 * 4) If the current element in the inner loop is greater than its next element, swap the values of the two elements.
 * END
 **/
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int [] arr = {7,8,9,1,3,0};
        arr = bubbleSort.bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private int[] bubbleSort(int[] arr) {
        int temp = 0 ;
        for (int i = 0; i < arr.length; i++) {  //n
            for (int j = 0; j < arr.length-1-i; j++) {  //n-1
                    if(arr[j]>arr[j+1]){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
        return arr;
    }
}
