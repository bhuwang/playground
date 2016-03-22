/**
 * 
 */
package com.bhuwan.java.jvm.garbagecollection;

/**
 * @author bhuwan
 *
 */
public class FinalizeDemoWithObjectReference {

    static FinalizeDemoWithObjectReference s;

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        FinalizeDemoWithObjectReference ref = new FinalizeDemoWithObjectReference();
        System.out.println("Hash Code: " + ref.hashCode());
        ref = null;
        System.gc();
        // Sleep thread for 5 min
        Thread.sleep(5000);
        System.out.println("Hash Code after GC got called: " + s.hashCode());
        s = null;
        // in this stage gc won't call finalize method.
        Runtime.getRuntime().gc();
        Thread.sleep(5000);
        System.out.println("End of main");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
        s = this;
    }

}
