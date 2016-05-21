/**
 * 
 */
package com.bhuwan.java.basics.oop.inheritance;

/**
 * @author bhuwan
 *
 */
public class MultipleInterfaceMethodHasSameMethodSig implements ParentM, ChildM {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // you cannot access variable a
        // System.out.println(a);
    }

    @Override
    public int m1() {
        // TODO Auto-generated method stub
        return 0;
    }

}

interface ParentM {
    // see what will happen changing the return type of m1() from int to void
    public int m1();

    int a = 5;
}

interface ChildM {
    public int m1();

    int a = 10;
}
