/**
 * 
 */
package com.bhuwan.java.basics.enums;

/**
 * @author bhuwan
 *
 */
public class AnonymousInnerClassDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        for (Color c : Color.values()) {
            c.info();
        }
    }

}

enum Color {
    RED, BLUE {
        public void info() {
            System.out.println("Different color");
        }
    },
    YELLOW;

    public void info() {
        System.out.println("Common Color");
    }
}
