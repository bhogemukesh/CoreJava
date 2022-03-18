package com.mukesh.corejava.array;

/**
 * @author Mukesh Bhoge
 **/
public class ReverseString {


    public static void main(String[] args) {

        // Reverse String
        String input  = "Welcome to home";
        String reverseString = reverseString(input);
        System.out.println("Reverse String ::: "+reverseString);

        // Reverse Order of words in string
        String input1  = "Welcome to home";
        String [] reverseWord = reverseWordString(input1);
        for (int i = 0; i < reverseWord.length; i++) {
            System.out.print(reverseWord[i]+" ");
        }

    }

    private static String[]  reverseWordString(String input1) {
        String [] inputArray = input1.split(" ");
        int j = inputArray.length-1;
        String  temp = "";
        for (int i = 0; i < inputArray.length/2; i++) {
            temp = inputArray[i];
            inputArray[i] = inputArray[j];
            inputArray[j] = temp;
            j--;
        }
        return inputArray;

    }

    private static String reverseString(String input) {
        char [] characterArray = input.toCharArray();
        int j =  characterArray.length-1;
        char temp;
        for (int i = 0; i < characterArray.length/2; i++) {
            temp = characterArray[i];
            characterArray[i] = characterArray[j];
            characterArray[j] = temp;
            j--;
        }
        return String.valueOf(characterArray);
    }
}
