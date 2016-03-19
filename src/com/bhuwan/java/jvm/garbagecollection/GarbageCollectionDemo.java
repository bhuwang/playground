/**
 * 
 */
package com.bhuwan.java.jvm.garbagecollection;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * run with vm args: -XX:+UseConcMarkSweepGC
 * @author bhuwan
 *
 */
public class GarbageCollectionDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<GarbageCollectorMXBean> garbageCollectorMXBeans = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean bean : garbageCollectorMXBeans) {
            System.out.println("Name: " + bean.getName());
            System.out.println("Collection Count: " + bean.getCollectionCount());
            System.out.println("Collection Time: " + bean.getCollectionTime());
            System.out.println("Pool Names:");
            for (String name : bean.getMemoryPoolNames()) {
                System.out.println("\t" + name);
            }
        }
    }

}
