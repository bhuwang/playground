/**
 * 
 */
package com.bhuwan.java.generics;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 * Before Generics.
 * 
 * @author bhuwan
 */
public class WithouUsingGenerics {

    private static final Logger log = Logger.getLogger(WithouUsingGenerics.class.getName());

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String args[]) {

        // create an empty mark list array
        ArrayList marksList = new ArrayList();

        // add marks
        marksList.add(94.0);
        marksList.add("Hundred");
        marksList.add(90.0);
        //no compile error: only runtime  error
        marksList.add(72);

        log.info("Percentage:: " + calculatePercentage(marksList));
    }

    /**
     * Method to calculate percentage on the basis of the mark list.
     * 
     * @author bhuwangautam<bhuwangautam@lftechnology.com>
     * @param marksList
     * @return percentage in {@link Double} format.
     */
    @SuppressWarnings("rawtypes")
    public static Double calculatePercentage(ArrayList marksList) {
        log.info("Inside WithouUsingGenerics#calculatePercentage method.");
        double sum = 0;
        int i = 0;
        for (Object mark : marksList) {
            sum += (Double)mark;
            i++;
        }
        return sum / i;
    }

}
