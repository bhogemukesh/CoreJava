package com.mukesh.corejava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Mukesh Bhoge
 **/
public class ConvertListToArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);

        // Convert List to array
        Integer [] iArray =  numbers.stream().toArray(Integer[]::new);

        // Print Array by converting to stream
        Stream.of(iArray).forEach(System.out::println);

    }
}
