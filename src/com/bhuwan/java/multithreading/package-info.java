package com.bhuwan.java.multithreading;

/**
 * <pre>
 * 
 * yield(): if your thread wants to pass its execution to give the chance for remaining waiting threads of same priority.
 * join():  if your thread wants to wait until completing other threads.
 * sleep(): if your thread don't want to perform operation for certain amount of time.
 * 
 * Property          yield()        join()      sleep()
 * =======================================================================
 * Overloaded Method    No          Yes         Yes
 * Final Method         No          Yes         No
 * throws IE            No          Yes         Yes
 * Native               Yes         No          Sleep(long ms)  -> Native
 * Static               Yes         No          Yes
 * 
 * 
 * DeadLock: If one or more threads waiting for each other then deadlock occurs.
 *           In a deadlock, both the threads don't even keep executing
 * LiveLock: In a live-lock, no thread makes progress but they keep executing.
 * Starvation: Starvation occurs when a process or service is not being served, even when there is no deadlock on the system.
 *             Some thread(s) DO make progress and some thread(s) aren't executing.
 *             Imagine in you're in a queue to pay get food at a restaurant, for which pregnant woman has priority. 
 *             And there's just a whole bunch of pregnant women arriving all the time. You'll soon be starving ;)
 * 
 * </pre>
 * 
 */
