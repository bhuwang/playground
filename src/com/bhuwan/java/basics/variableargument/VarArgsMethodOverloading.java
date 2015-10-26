/**
 * 
 */
package com.bhuwan.java.basics.variableargument;

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

}
