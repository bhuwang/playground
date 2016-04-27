/**
 * 
 */
package com.bhuwan.java.basics.enums;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author bhuwan
 *
 */
public class MonthEnumDemo {

    public static void main(String[] args) {
        // convert to stream and print using method reference
        Stream.of(Month.values()).forEach(System.out::println);

        // convert to List<String>
        List<String> collect = Stream.of(Month.values()).map(Enum::name).collect(Collectors.toList());

        // print ordinal values
        for (Month m : Month.values()) {
            System.out.println("value: " + m + "..... ordinal value: " + m.ordinal());
        }
    }
}
