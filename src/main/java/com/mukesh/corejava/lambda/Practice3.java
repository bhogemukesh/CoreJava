package com.mukesh.corejava.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author Mukesh Bhoge
 **/
public class Practice3 {
    public static void main(String[] args) {
        // Very simple lambda which return constant value
        Practice3 p3 = new Practice3();
        p3.runnableLambda();
        p3.iterateLoopUsingLambda();
        p3.getValue();
    }

    private void getValue() {
        MyFunction myFunc = () -> {
            //  DO any operation and return value accordingly
            return 5;
        };
        System.out.println(myFunc.getValue());
    }

    private void iterateLoopUsingLambda() {
        String[] str = {"Mukesh", "Chhaya", "Yogita", "Sagar", "Bhuvi", "Pranu", "Konark"};
        Arrays.stream(str).forEach(System.out::println);
        Arrays.stream(str).sorted().forEach(System.out::println);
        String joinedString = Arrays.stream(str).sorted(Comparator.reverseOrder()).collect(Collectors.joining(","));
        System.out.println("joinedString :: " + joinedString);
    }

    private void runnableLambda() {
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello " + i);
            }

        };
        Thread th = new Thread(r1);
        th.start();
    }
}
