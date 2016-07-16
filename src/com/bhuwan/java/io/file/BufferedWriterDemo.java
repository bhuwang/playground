/**
 * 
 */
package com.bhuwan.java.io.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author bhuwan
 *
 */
public class BufferedWriterDemo {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("file_writer_demo.txt", true));
                BufferedWriter bw1 = new BufferedWriter(new FileWriter("file_writer_demo1.txt"));
                // initializing double buffered writer object.
                BufferedWriter bw2 = new BufferedWriter(new BufferedWriter(new FileWriter("file_writer_demo1.txt")));) {
            bw.write(66);
            bw.write("huwan");
            bw.newLine();
            bw.write("Hello BufferWriter!!");
            bw.newLine();
            bw.write(new char[] { 'A', 'B', 'C' });
            bw.newLine();
            bw.write('X');
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            System.out.println("Inside Exception block.");
        }
    }

}
