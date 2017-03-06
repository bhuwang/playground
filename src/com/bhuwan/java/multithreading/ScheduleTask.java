/**
 * 
 */
package com.bhuwan.java.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author bhuwan
 *
 */
public class ScheduleTask {

    private static void myTask() {
        System.out.println("Running a new Task");
    }

    private static void myTask2() {
        System.out.println("Running a new Task with fixed delay");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        final ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(ScheduleTask::myTask, 0, 1, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(ScheduleTask::myTask2, 0, 5, TimeUnit.SECONDS);
    }

}
