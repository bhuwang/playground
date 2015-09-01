/**
 * 
 */
package com.lftechnology.java.basics.casting;

/**
 * Part2: The statement where the Java compiler complains about is a normal
 * arithmetic statement. We are adding two byte variables and assigning it to
 * another byte variable. Whats wrong with this? The error says, “required: byte
 * and found: int”. How come, it found ‘int’? We have never declared anything as
 * int in this program.
 * 
 * @author bhuwan
 */
public class NumericPromotionDemo {
    public static void main(String... args) {
        // part 1
        final byte a = 1;
        final byte b = 2;
        byte c = a + b;
        System.out.println(c);

        // part 2
        byte i = 1;
        byte j = 2;
        /*
         * There is no addition operator for byte. This addition operator used
         * here promotes its operands to ‘int’ automatically. Narrowing
         * conversion is not done automatically by the Java runtime. We need to
         * explicitly cast the value to byte
         */
        // byte k = i + j;
        // System.out.println(k);
    }
}
