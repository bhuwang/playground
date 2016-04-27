/**
 * 
 */
package com.bhuwan.java.basics.enums;

/**
 * @author bhuwan
 *
 */
public class FullFledgeEnumDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        for (SoftDrinks sd : SoftDrinks.values()) {
            System.out.println("Drink: " + sd + " Price: " + sd.getPrice());
        }
    }

}

enum SoftDrinks {
    COKE(25), FRUTI(30), REAL(26), REDBULL(35), COCONUT;

    int price;

    SoftDrinks() {
    }

    SoftDrinks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
