/**
 * 
 */
package com.bhuwan.java.jdk8.functionalinterface;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * @author bhuwangautam
 *
 */
public class PerdicateDemo {

    public static void main(String[] args) {
        // even number predicate
        IntPredicate evenPred = num -> num % 2 == 0;

        IntStream.range(0, 20).filter((evenPred)).forEach(System.out::println);

    }
}
