/**
 * 
 */
package com.bhuwan.java.exception;

/**
 * @author bhuwan
 *
 */
public class FinallyBlockDemo {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        double a = 1 / 0;
        try {
            System.out.println("Inside try");
            // double a = 1 / 0;
        } catch (Exception e) {
            System.out.println("Inside catch");
            e.printStackTrace();
        } finally {
            System.out.println("Inside finally");
        }
    }

}
