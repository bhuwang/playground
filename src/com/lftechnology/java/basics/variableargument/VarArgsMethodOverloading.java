/**
 * 
 */
package com.lftechnology.java.basics.variableargument;

/**
 * @author bhuwan
 */
public class VarArgsMethodOverloading {
    
    public static void main(String[] args) {
        System.out.println(sum(1));
        System.out.println(sum(1, 2, 3, 4, 5));

    }

    public static int sum(int i, int... js) {
        System.out.println("sum1 called");
        int sum = i;
        for (int x : js) {
            sum += x;
        }
        return sum;
    }

    public static int sum(int i, int k, Object... js) {
        System.out.println("sum2 called");
        int sum = i + k;
        for (Object x : js) {
            sum += (int)x;
        }
        return sum;
    }

}
