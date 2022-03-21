package com.mukesh.corejava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Mukesh Bhoge
 **/
public class PredicateExample {
    public static void main(String[] args) {

        PredicateExample pe = new PredicateExample();
        pe.listAllElementsStartWithA();

    }

    private void listAllElementsStartWithA() {
        String []  arr = {"AA","XYZ","PQR","APPLE","APPRECOAT"};
        Predicate<String> startWithA = x->x.startsWith("A");
        List<String> letterStartWIthA = Arrays.stream(arr).filter(startWithA).collect(Collectors.toList());
        System.out.println("List start with A :: "+letterStartWIthA);
        //Predicate Chaining
        Predicate<String> lengthIsMoreThan3 = x->(x.length()>3);

        Predicate<String> chainedPredicate = startWithA.and(lengthIsMoreThan3);
        String result = Arrays.stream(arr).filter(chainedPredicate).collect(Collectors.joining(","));
        System.out.println("Result :: "+result);

    }
}
