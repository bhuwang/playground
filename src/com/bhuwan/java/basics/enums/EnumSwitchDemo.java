/**
 * 
 */
package com.bhuwan.java.basics.enums;

/**
 * @author bhuwan
 *
 */
public class EnumSwitchDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SoftDrink drink = SoftDrink.FANTA;
        switch (drink) {
        case COKE:
            System.out.println("Boys Favourite");
            break;
        case FANTA:
            System.out.println("Girls Favourite");
            break;
        case SPRITE:
            System.out.println("Adults Favourite");
            break;
        case SLICE:
            System.out.println("Seniors Favourite");
            break;
        default:
            System.out.println("Not recommended");
        }
    }

}

enum SoftDrink {
    COKE, FANTA, SLICE, SPRITE
}
