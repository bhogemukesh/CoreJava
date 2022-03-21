package com.mukesh.corejava.lambda;

import java.io.FileNotFoundException;

/**
 * @author Mukesh Bhoge
 * <p>
 * If a lambda expression body throws an exception, the throws clause of the functional interface method
 * must declare the same exception type or its supertype or in other words the exception thrown from the
 * lambda expression must be same or subtype of the exception declared in the throws clause of the
 * functional interface in Java.
 **/
public class LambdaFunctionExceptionHandling {
    public static void main(String[] args) {
        // As we are throwing same Exception it will accept
        IntFunction intFunction = (x, y) -> {
            throw new FileNotFoundException();
        };
        try {
            System.out.println("-->"+intFunction.add(1,2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        // As we are throwing Parent Exception here it will give compile time error
//        IntFunction intFunction2 = (x,y)-> {
//            throw  new IOException();
//        };
    }
}
