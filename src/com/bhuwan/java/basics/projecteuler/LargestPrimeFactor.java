/**
 * 
 */
package com.bhuwan.java.basics.projecteuler;

/**
 * @author bhuwangautam
 *
 */
public class LargestPrimeFactor {

	public static void main(String[] args) {
		long number = 600851475143L;

		for (long factor = 2l; factor < number; factor++) {
			if (number % factor == 0) {
				if (LargestPrimeFactor.isPrime(factor)) {
					System.out.println("Prime Factor: " + factor);
				}
			}
		}
	}

	private static boolean isPrime(long primeNum) {
		boolean isPrime = Boolean.TRUE;
		for (long i = 2l; i < primeNum; i++) {
			if (primeNum % i == 0) {
				isPrime = Boolean.FALSE;
				break;
			}
		}
		return isPrime;
	}
}
