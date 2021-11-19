/**
 * 
 */
package com.bhuwan.java.basics.projecteuler;

/**
 * @author bhuwangautam
 * 
 *
 */
public class SumOfNaturalNumbers {

	/*
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
	 * get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * 
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	public static void main(String[] args) {
		int sum = 0;
		for (int num = 1; num < 1000; num++) {
			if (num % 3 == 0 || num % 5 == 0)
				sum += num;
		}
		System.out.println("Sum of all the multiples of 3 or 5 below 1000: " + sum);
	}

}
