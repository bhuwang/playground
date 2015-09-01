/**
 * 
 */
package com.lftechnology.java.basics.equality;

/**
 * @author bhuwan
 */
public class EqualityCheckDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String name = "Bhuwan Gautam";
        String name2 = "Bhuwan Gautam";
        String name3 = new String("Bhuwan Gautam");

        System.out.println("String Equality Check........");
        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name.equals(name3));

        Integer number = 128;
        int number2 = 128;
        Integer number3 = 128;
        Integer number4 = new Integer(128);
        Integer number5 = new Integer(128);

        System.out.println("\n\nInteger Equality Check........");
        System.out.println(number == number2);
        System.out.println(number == number3);
        System.out.println(number == number4);
        System.out.println(number4 == number5);
        System.out.println(number2 == number4);
        
        
        // strange
        System.out.println("\n\nInteger Equality Check Strange........");
        Integer number7 = 128;
        Integer number8 = 128;
        System.out.println(number7 == number8);

        Integer number9 = 127;
        Integer number6 = 127;

        System.out.println(number9 == number6);
    }

}
