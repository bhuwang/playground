/**
 * 
 */
package com.bhuwan.java.puzzle;

/**
 * @author bhuwan
 *
 */
public class FloatingPointPuzzle {

    /**
     * Same like this, in binary representation 0.1 keeps on continuing. Even though 0.1 is a continuing number, there are only fixed number
     * of bits available to represent it. To understand how many bits are available, we should understand IEEE-754. Java follows
     * "ANSI/IEEE Standard 754-1985 (IEEE, New York)" for floating point operations. There are 53 bits available to represent in binary.
     * 
     * Lets now convert 0.1 to binary and round it off to 53 places,
     * 
     * 0.0001100110011001100110011001100110011001100110011001101
     * 
     * So, the above number is what gets stored when we create a double 0.1
     * 
     * If we convert the above binary back to decimal we get,
     * 
     * 0.1000000000000000055511151231257827021181583404541015625
     * 
     * which is slightly greater than 0.1 (where it all started). Eventually when we keep on adding 0.1 to it, the 'slightly greater' number
     * swells and overflows.
     * 
     * @param args
     * @see http://docs.oracle.com/javase/specs/jls/se7/html/jls-4.html#jls-4.2.3
     */
    public static void main(String[] args) {
        double d1 = 0.1d;
        double d2 = 0.1d;
        double d3 = 0.1d;
        d1 = d1 + d2 + d3;
        System.out.println(d1);
        /**
         * a=7; b=8; a=a^b; b=b^a; a=a^b;
         */
        // expected result = 0.3
        // result = 0.30000000000000004
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += 0.1;
        }
        System.out.println(sum);
    }

}
