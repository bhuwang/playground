/**
 * 
 */
package com.bhuwan.java.generics;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * @author bhuwan
 */
public class UsingGenerics {

    private static final Logger log = Logger.getLogger(WithoutUsingGenerics.class.getName());

    public static void main(String args[]) {

        // create an empty mark list array
        ArrayList<Double> marksList = new ArrayList<>();

        // add marks
        marksList.add(94.0);
        //marksList.add("Hundred");
        marksList.add(90.0);
        //compile-time error
        //marksList.add(72);

        log.info("Percentage:: " + calculatePercentage(marksList));
    }

    /**
     * Method to calculate percentage on the basis of the mark list.
     * 
     * @author bhuwangautam<bhuwangautam@lftechnology.com>
     * @param marksList
     * @return percentage in {@link Double} format.
     */
    public static Double calculatePercentage(ArrayList<Double> marksList) {
        log.info("Inside WithouUsingGenerics#calculatePercentage method.");
        double sum = 0;
        int i = 0;
        for (Double mark : marksList) {
            sum += mark;
            i++;
        }
        return sum / i;
    }

}
