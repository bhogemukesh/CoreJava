package com.mukesh.corejava.array;

import java.util.Arrays;

/**
 * @author Mukesh Bhoge
 **/
public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int [] arr =  {2,1,3,5,7,9,10,2,13,14,16};

        // Approach 1 : with O(n^2) complexity
//        int [] missingNumber = getMissingNumberNSquareComplexity(arr);
//        for (int i = 0; i < missingNumber.length; i++) {
//            System.out.print(missingNumber[i] +", ");
//        }
        // Approach 1 : with O(n^2) complexity
         getMissingNumber(arr);

    }

    //  Here we will create array with size largest number+1 and will place the number in the particular index only
    // and will print the empty index number as missing number
    private static void getMissingNumber(int[] arr) {
        int[] sortedArray = Arrays.stream(arr).sorted().toArray();
        int [] arrayWithMoreCapacity = new int[sortedArray[arr.length-1]+1];
        for (int i = 0; i < arr.length; i++) {
            arrayWithMoreCapacity[arr[i]] = arr[i];
        }
        for (int i = sortedArray[0]; i < arrayWithMoreCapacity.length; i++) {
            if (arrayWithMoreCapacity[i]==0){
                System.out.print(i+", ");
            }
        }
    }

    // Here we are using two loops first will be run n times and inner one is n+1.
    // However, complete complexity is n(n+1) = n^2+n. As we take the highest power the complexity is n^2
    private static int [] getMissingNumberNSquareComplexity(int[] arr) {
        // There is possibility that number is in random sequence
        // Sort the array
        // Check the length  of array
        // Check first number and last number and iterate between that and find out the missing number
        arr = Arrays.stream(arr).sorted().toArray();
        int smallestNumber = arr[0];
        int largestNumber = arr[arr.length-1];
        int [] missingNumber = new int[largestNumber-arr.length];
        int missingNumberIndex = 0;
        boolean isElementFound =  false;
        int number = 0;
        for (int i = smallestNumber; i < arr[arr.length-1]; i++) { // here array will go till n+1
            isElementFound =  false;
            for (int i1 = 0; i1 < arr.length; i1++) {   // here loop will go till n
                number = arr[i1];
                if(i == number) {
                    isElementFound =  true;
                    break;
                } else if(number>i) {
                    number = i;
                    break;
                }
            }
            if (!isElementFound) {
                missingNumber[missingNumberIndex] = number;
                missingNumberIndex++;
            }
        }
        return  missingNumber;
    }
}
