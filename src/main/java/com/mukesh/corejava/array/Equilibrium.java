package com.mukesh.corejava.array;

/**
 * @author Mukesh Bhoge
 * Here we need to find the sum of left side numbers and sum of right side numbers
 * and then find out minimum difference between two sums
 **/
public class Equilibrium {
    public static void main(String[] args) {
        int[] array = {3,1,2,4,3,7,5,8,9,1};
        int leftElementSum = 0;
        int rightElementSum = 0;
        int absoluteDifference = 0;
        int previousAbsoluteDifference = 99999999;
        int indexOfEquilibrium = 0 ;
        for (int i = 1; i < array.length-1; i++) {
            leftElementSum = getSumOfLeftElements(i,array);
            rightElementSum = getSumOfRightElements(i,array);
            absoluteDifference = Math.abs(leftElementSum-rightElementSum);
            if (previousAbsoluteDifference > absoluteDifference){
                previousAbsoluteDifference = absoluteDifference;
                indexOfEquilibrium = i;
            }

            System.out.println("Index :: "+i+"\t absoluteDifference :: "+absoluteDifference);
        }
        System.out.println("Equilibrium index :: "+indexOfEquilibrium +" and value is "+array[indexOfEquilibrium]);
    }

    private static int getAbsoluteDifference(int leftElementSum, int rightElementSum) {
        int diff = leftElementSum = rightElementSum;
        return diff < 0 ? -diff : diff;
    }

    private static int getSumOfRightElements(int i, int[] input) {
        int sum = 0;
        for (int j = i; j < input.length ; j++) {
            sum = sum + input[j];
        }
        return sum;
    }

    private static int getSumOfLeftElements(int i, int [] input) {
        int sum = 0;
        for (int j = i; j >=0  ; j--) {
            sum = sum + input[j];
        }
        return sum;
    }
}
