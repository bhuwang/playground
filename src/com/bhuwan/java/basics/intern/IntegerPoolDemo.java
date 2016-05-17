/**
 * 
 */
package com.bhuwan.java.basics.intern;

import java.io.Serializable;

/**
 * @author bhuwan
 *
 */
public class IntegerPoolDemo implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 4912438235835115699L;
    Integer packageLevel;

    /**
     * @param args
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        Integer a = 123;
        Integer b = 123;
        if (a == b) {
            System.out.println("a==b");
        }

        Integer a1 = 127;
        Integer b1 = 127;
        if (a1 == b1) {
            System.out.println("a1==b1");
        }

        int aa = 256;
        int bb = 256;
        if (aa == bb) {
            System.out.println("aa==bb");
        }

        Integer aaa = new Integer(123);
        Integer bbb = new Integer(123);

        if (aaa == bbb) {
            System.out.println("aaa==bbb");
        }
    }

}