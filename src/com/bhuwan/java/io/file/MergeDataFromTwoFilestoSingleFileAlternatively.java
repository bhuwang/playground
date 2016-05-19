/**
 * 
 */
package com.bhuwan.java.io.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 * <pre>
 * Read data from two files file1.txt and file2.txt and write to file3.txt where write to file should be done alternatively. 
 * Steps:
 * 1. read first line from file1 and write to file3
 * 2. read first line from file2 and write to file3
 * 3. read second line from file1 and write to file3
 * 4. read second line from file2 and write to file3
 * and so on.........
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class MergeDataFromTwoFilestoSingleFileAlternatively {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("file3.txt"); BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));) {

            // read from file1
            String line1 = br.readLine();
            // read from file2
            String line2 = br2.readLine();
            while (line1 != null || line2 != null) {
                if (line1 != null) {
                    pw.println(line1);
                    line1 = br.readLine();
                }
                if (line2 != null) {
                    pw.println(line2);
                    line2 = br2.readLine();
                }
            }
            pw.flush();
        } catch (Exception e) {
            System.out.println("Inside exception catch block.");
        }
    }

}
