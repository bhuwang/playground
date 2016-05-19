/**
 * 
 */
package com.bhuwan.java.io.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author bhuwan
 *
 */
public class BufferedReaderDemo {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("file_writer_demo.txt"));) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (Exception e) {

        }
    }

}
