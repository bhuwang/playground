package com.lftechnology.java.basics.passbyvalue;

/**
 * Explanation for pass by value
 * 
 * @author bhuwan
 */
public class PassByValueExample {

    public static void main(String[] args) {
        Balloon red = new Balloon("red");
        Balloon blue = new Balloon("blue");

        System.out.println("before swap - one red:" + red.getColor() + " - two blue:" + blue.getColor());
        swap(red, blue);
        System.out.println("after swap - one red:" + red.getColor() + " - two blue:" + blue.getColor());

        foo(blue);
        System.out.println("after foo - blue:" + blue.getColor());
    }

    public static void foo(Balloon ballon) {
        ballon.setColor("red");
        ballon = new Balloon("green");
        ballon.setColor("blue");
    }

    // Swap Method
    public static void swap(Object one, Object two) {
        Object temp = one;
        one = two;
        two = temp;
        System.out.println("inside swap - one red:" + ((Balloon)one).getColor() + " - two blue:"
                + ((Balloon)two).getColor());
    }
}
