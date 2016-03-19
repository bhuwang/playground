/**
 * 
 */
package com.bhuwan.java.jvm.garbagecollection;

import java.util.Random;

/**
 * @author bhuwan
 *
 */
public class AllocationOverwrite {

    /**
     * <pre>
     * jps
     * jstat -gcutil 16981 : displays total memory space used by various spaces
     * jstat -gccause 16981 : displays various causes for gc
     * jstat -gccapacity 16981 : displays the memory allocated for the various regions.
     * jstat -gc 16981 : displays utilization and capacity
     * jstat -gc 16981 1000 10 : jstat -gc <pid> <ms> <no of rows>
     * S0 and S1: Surviour space
     * E : Eden space
     * O : old space
     * M : meta space
     * YGC: young garbage collection
     * FGCT: full garbage collection time
     * NGCMN: minimum memory allocated for new garbage collector
     * NGCMX: maximum memory allocated for new garbage collector
     * EC+SC = NGC
     * 
     * jvisualvm : GUI tool for java memory profiler
     * 
     * </pre>
     * 
     * @param args
     */
    public static void main(String... args) {
        int arrSize = 2000000;
        GcMe[] gcmes = new GcMe[arrSize];

        int count = 0;
        Random random = new Random();
        while (true) {
            gcmes[random.nextInt(arrSize)] = new GcMe();
            if (count % arrSize == 0) {
                System.out.print(".");
            }
            count++;
        }
    }

    static class GcMe {
        long a;
        long aa;
        long aaa;
        long aaaa;
        long aaaaa;
        long aaaaaa;
        long aaaaaaa;
        long aaaaaaaa;
        long aaaaaaaaa;
        long aaaaaaaaaa;
        long aaaaaaaaaaa;
        long aaaaaaaaaaaa;
        long aaaaaaaaaaaaa;
        long aaaaaaaaaaaaaa;
        long aaaaaaaaaaaaaaa;
        long aaaaaaaaaaaaaaaa;
        long aaaaaaaaaaaaaaaaa;
    }

}
