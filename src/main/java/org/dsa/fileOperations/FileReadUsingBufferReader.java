package org.dsa.fileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author Arti Harde
 */
public class FileReadUsingBufferReader {

    public static void main(String[] args) throws Exception
    {

        // File path is passed as parameter
        File file = new File("src/main/resources/demo.txt");

        // Creating an object of BufferedReader class
        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;

        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)
            // Print the string
            System.out.println(st);

        br.close();
    }

}