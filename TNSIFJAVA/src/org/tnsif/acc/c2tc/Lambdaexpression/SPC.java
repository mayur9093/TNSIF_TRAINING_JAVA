package org.tnsif.acc.c2tc.Lambdaexpression;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SPC {
    public static void main(String[] args) {
        // Supplier - No input, return value
        Supplier<String> s = () -> "Hello World!";
        String supVal = s.get();
        System.out.println(supVal);

        // Predicate - takes input, return boolean
        Predicate<Integer> eligible = (salary) -> salary > 30000;
        System.out.println(eligible.test(40000));

        // Consumer - takes one input, returns nothing
        Consumer<String> c = message -> System.out.println("Message Recieved: " + message);
        c.accept("hi!");
    }
}
