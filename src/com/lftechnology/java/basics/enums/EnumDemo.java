/**
 * 
 */
package com.lftechnology.java.basics.enums;

/**
 * @author bhuwan
 */
public class EnumDemo {
    /**
     * This method shows the benefit of using Enum over Constants
     */
    private static void benefitsOfEnumOverConstants() {
        // Enum values are fixed
        simpleEnumExample(ThreadStateEnum.START);
        simpleEnumExample(ThreadStateEnum.WAITING);
        simpleEnumExample(ThreadStateEnum.RUNNING);
        simpleEnumExample(ThreadStateEnum.DEAD);
        simpleEnumExample(null);

        simpleConstantsExample(1);
        simpleConstantsExample(2);
        simpleConstantsExample(3);
        simpleConstantsExample(4);
        // we can pass any int constant
        simpleConstantsExample(5);
       
        //
        ThreadStateEnum.values();
    }

    private static void simpleEnumExample(ThreadStateEnum th) {
        if (th == ThreadStateEnum.START)
            System.out.println("Thread started");
        else if (th == ThreadStateEnum.WAITING)
            System.out.println("Thread is waiting");
        else if (th == ThreadStateEnum.RUNNING)
            System.out.println("Thread is running");
        else
            System.out.println("Thread is dead");
    }

    private static void simpleConstantsExample(int i) {
        if (i == ThreadStateConstant.START)
            System.out.println("Thread started");
        else if (i == ThreadStateConstant.WAITING)
            System.out.println("Thread is waiting");
        else if (i == ThreadStateConstant.RUNNING)
            System.out.println("Thread is running");
        else
            System.out.println("Thread is dead");
    }
}
