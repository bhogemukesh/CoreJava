package com.mukesh.corejava.array;

/**
 * @author Mukesh Bhoge
 **/
public class FibonacciSeries {


    public static void main(String[] args) {
        int count = 20;
        int n1 = 0;
        int n2 = 1;
        int temp = 0;
        System.out.print(n1+", "+n2+", ");
        for (int i = 2; i < 20; i++) {
            temp = n1 + n2;
            System.out.print(temp + ", ");
            n1 = n2;
            n2 = temp;
        }

    }

}
