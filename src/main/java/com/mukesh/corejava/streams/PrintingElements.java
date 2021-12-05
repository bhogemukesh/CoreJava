package com.mukesh.corejava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Mukesh Bhoge
 * Using foreach to execute function
 * 1) Inbuild Function
 * 2) Custom Function
 **/
public class PrintingElements {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Mukesh");
        names.add("Abhijeet");
        names.add("Sagar");
        names.add("Dinesh");

        // Case 1 :: Use foreach for in build  println function of System.out
        names.stream().forEach(System.out::println);

        // Case 2 ::  Use Custom Function
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        Consumer<Integer> c = i->{
            System.out.println("The square of "+i+" is "+(i*i)+".");
        };
        numbers.stream().forEach(c);

        //  Same can be printed as below
        numbers.stream().forEach(
            i->System.out.println("New Way :: The square of "+i+" is "+(i*i)+".")
        );

    }
}
