/**
 * 
 */
package com.lftechnology.java.basics.fibonacci;

import java.util.Calendar;

/**
 * @author bhuwan
 */
public class EvenFibonacciSum {

    public static void main(String[] args) {
        
 //System.out.println(sum);
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 16); //Set Day of the Month, 1..31
        cal.set(Calendar.MONTH,7); //Set month, starts with JANUARY = 0
        cal.set(Calendar.YEAR,2015); //Set year
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
    }
}
