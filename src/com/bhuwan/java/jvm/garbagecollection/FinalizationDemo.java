/**
 * 
 */
package com.bhuwan.java.jvm.garbagecollection;

/**
 * @author bhuwan
 *
 */
public class FinalizationDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // String demo = new String("Bhuwan");
        FinalizationDemo demo = new FinalizationDemo();
        demo = null;
        System.gc();
        System.out.println("End of main");
    }

    /*
     * Just before destroying an object garbage collector calls the finalize method on the object which is eligible for gc. Then the
     * corresponding finalize() method will be executed. For eg. if a String object eligible for gc then String's class finalize() method
     * will be executed but not FinalizationDemo finalize() method.
     * 
     * @see java.lang.Object#finalize()
     */
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }

}
