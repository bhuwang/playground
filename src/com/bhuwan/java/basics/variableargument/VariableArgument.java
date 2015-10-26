/**
 * 
 */
package com.bhuwan.java.basics.variableargument;

/**
 * @author bhuwan
 */
public class VariableArgument {
    // method with variable arguments
    public static int sum(int i, int... js) {
        int sum = i;
        for (int x : js) {
            sum += x;
        }
        return sum;
    }

    // method with same implementation as sum with array as argument
    public static int sumArray(int i, int[] js) {
        int sum = i;
        for (int x : js) {
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Using var args:: " + sum(1, 2, 3, 4, 5, 6, 7, 8, 9));

        int array[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Using Array:: " + sum(1, array));
        
        // with sumArray method
        System.out.println("Using sumArray method:: " + sumArray(1, array));
    }
}
