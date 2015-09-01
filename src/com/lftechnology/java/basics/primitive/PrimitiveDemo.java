/**
 * 
 */
package com.lftechnology.java.basics.primitive;

/**
 * @author bhuwan
 */
public class PrimitiveDemo {

    public static void main(String[] args) {
        // The built-in integer operators do not indicate overflow or underflow
        // in any way.

        // Adding 1 to max value
        byte aa = 127;
        aa = (byte)(aa + 1);
        System.out.println(aa);

        // Subtracting 1 to min value
        aa = -128;
        aa = (byte)(aa - 1);
        System.out.println(aa);

        assert aa >= 130;

        if(Integer.MAX_VALUE + 1 == Integer.MIN_VALUE){
            System.out.println("Integer.MAX_VALUE + 1 == Integer.MIN_VALUE");
        }
        
        if(Integer.MIN_VALUE - 1 == Integer.MAX_VALUE){
            System.out.println("Integer.MIN_VALUE - 1 == Integer.MAX_VALUE");
        }
        
        // modulo exception when right hand operand zero
        int a = 4 % 0;
    }
}
