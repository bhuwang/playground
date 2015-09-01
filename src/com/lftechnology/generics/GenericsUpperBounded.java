/**
 * 
 */
package com.lftechnology.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bhuwan
 */
public class GenericsUpperBounded {

    public static double sumWithoutWildCard(List<Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Number> ints = new ArrayList<>();
        ints.add(3);
        ints.add(5);
        ints.add(10);
        double sum = sumWithWildCard(ints);
        System.out.println("Sum of ints=" + sum);
    }

    public static double sumWithWildCard(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

}
