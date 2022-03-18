package com.mukesh.corejava.array;

/**
 * @author Mukesh Bhoge
 **/
public class CyclicRotationOfArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int numberOfRotation = 3;
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
//        rotateArray(arr,numberOfRotation);
        rotationUsingMod(arr , numberOfRotation);
    }

    private static void rotationUsingMod(int[] arr, int numberOfRotation) {
        int [] finalArray = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            finalArray[(i+numberOfRotation)%arr.length] = arr[i];
        }
        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i]+", ");
        }

    }

    private static void rotateArray(int[] arr, int numberOfRotation) {
        int [] finalResult = arr.clone();
        int j=0;
        for (int i = numberOfRotation; i > 0; i--) {
            finalResult[arr.length-i] = arr[j];
            j++;
        }
        j=0;
        for (int i = numberOfRotation; i < arr.length; i++) {
            finalResult[j]= arr[i];
            j++;
        }

        for (int i = 0; i < finalResult.length; i++) {
            System.out.print(finalResult[i]+", ");
        }

    }
}
