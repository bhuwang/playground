/**
 * 
 */
package com.bhuwan.java.basics.innerclasses.annonymous;

/**
 * @author bhuwan
 *
 */
public class AnnonymousClassDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        new PopCorn().taste();

        // or
        new SubPopCorn().taste();

        // or
        PopCorn sweet = new PopCorn() {
            public void taste() {
                System.out.println("Taste : Sweet Corn");
            }
        };
        sweet.taste();

        // or
        PopCorn sour = new PopCorn() {
            public void taste() {
                System.out.println("Taste : Sour Corn");
            }
        };
        sour.taste();
        
        System.out.println(sweet.getClass().getName());
        System.out.println(sour.getClass().getName());
    }

}

class PopCorn {
    public void taste() {
        System.out.println("Taste : Spicy");
    }
}

class SubPopCorn extends PopCorn {
    public void taste() {
        System.out.println("Taste : Salty");
    }
}