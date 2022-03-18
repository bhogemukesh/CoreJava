package com.mukesh.corejava.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Mukesh Bhoge
 **/
public class DebugStreams {
    // peek is the method which can be use for debugging streams.
    public static void main(String[] args) {
        List<String> result =Stream.of("Mukesh","Parag","Sandip","Sachin","Harshad")
                .filter(e-> e.length()>=3)
                .peek(e-> System.out.println("Filtered Value "+e))
                .filter(e->e.startsWith("S"))
                .peek(e-> System.out.println("Letter starting with S having size more than or equal to 6"+e))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
