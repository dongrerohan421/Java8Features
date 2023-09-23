package org.example.bipredicate;

import java.util.function.BiPredicate;

public class Java8BiPredicate {
    /* In Java 8, BiPredicate is a functional interface, which accepts two arguments and returns a boolean,
       basically this BiPredicate is same with the Predicate, instead, it takes 2 arguments for the test.
     */

    public static void main(String[] args) {

        // ----------- Example to check sum of 2 given numbers is even or not ------------
        System.out.println("Example to check sum of 2 given numbers is even or not:");
        BiPredicate<Integer, Integer> biPredicate = (a,b) -> (a + b) % 2 == 0;
        System.out.println("Sum of 10 + 20 given numbers is even or not: " + biPredicate.test(10, 20));
        System.out.println("Sum of 11 + 25 given numbers is even or not: " + biPredicate.test(12, 25));
    }
}
