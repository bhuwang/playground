/**
 * 
 */
package com.bhuwan.java.io.file;

import java.io.PrintWriter;

/**
 * @author bhuwan
 *
 */
public class PrintWriterDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("file_writer_demo.txt");) {
            // will write B to the file, since PrintWriter using write method.
            pw.write(66);
            // will write 100 directly to the file.
            pw.println(100);
            pw.println(true);
            pw.println(10.2);
            pw.println("Bhuwan");
            pw.flush();
        } catch (Exception e) {
            System.out.println("Inside exception catch block.");
        }

    }

}
