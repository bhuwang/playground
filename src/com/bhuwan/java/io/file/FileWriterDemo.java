/**
 * 
 */
package com.bhuwan.java.io.file;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author bhuwan
 *
 */
public class FileWriterDemo {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        try (
                // FileWriter fw = new FileWriter("file_writer_demo.txt");
                FileWriter fw = new FileWriter("file_writer_demo.txt", true);) {
            fw.write(66);
            fw.write("huwan");
            fw.write("\n");
            fw.write("Hello FileWriter!!");
            fw.write("\n");
            fw.write(new char[] { 'A', 'B', 'C' });
            fw.write("\n");
            fw.write('X');
            fw.write("\n");
            fw.flush();
        } catch (Exception e) {
            System.out.println("Inside Exception block.");
        }
    }

}
