package org.example.sandbox.lambda;

import java.util.function.*;

public class lambdaDemo {

    // x -> x * 2

    // 4 classes
    // Predicate - takes 1 value return a boolean

    Predicate<String> predicate = x -> x.startsWith("a");

    // Function - takes 1 value return a value

    Function<Integer, Integer> function = x -> {
        x = x + 5;
        return x * 2;
    };

    // Supplier - takes nothing return a value
    Supplier<String> supplier = () -> "Hello World";

    // Consumer - takes 1 value return nothing
    Consumer<String> consumer = x -> System.out.println(x);



}
