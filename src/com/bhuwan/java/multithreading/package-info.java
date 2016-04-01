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
 * </pre>
 * 
 */
