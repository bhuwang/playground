/**
 * 
 */
package com.bhuwan.java.basics.operatorts;

/**
 * @author bhuwan
 *
 */
public class IncrementDecrementDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int x = 4;
        int y = 0;
        System.out.println("x: " + x + " y: " + y);

        y = ++x;
        System.out.println("x: " + x + " y: " + y);
        x = 4;

        y = x++;
        System.out.println("x: " + x + " y: " + y);
        x = 4;

        y = --x;
        System.out.println("x: " + x + " y: " + y);
        x = 4;

        y = x--;
        System.out.println("x: " + x + " y: " + y);

        // 1. we can increment/decrement only for variable not for constants.
        // 5++;

        // 2. Nesting of increment and decrement not allowed
        // y = ++(++x);

        // 3. we can't apply increment or decrement for final variables.
        final int abc = 9;
        // abc++;

        // 4. We can apply increment/decrement for all the primitive data type except boolean.
        double d = 10.5;
        d++;
        System.out.println();
        System.out.println("d: " + d);

        char e = 'e';
        e++;
        System.out.println();
        System.out.println("e: " + e);

        boolean ee = true;
        // ee++;
    }

}
