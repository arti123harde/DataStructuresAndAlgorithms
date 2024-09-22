package org.dsa.fileOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Arti Harde
 */
public class WriteToFileUsingWriteString {

    public static void main(String[] args) {
        // Assigning the content of the file
        String text = "\nHello Arti !!!!\nWelcome to GeeksforGeeks\nHappy Learning!";

        // Defining the file name of the file
        Path fileName = Path.of("src/main/resources/text.txt");

        try {
            // Writing into the file
            Files.writeString(fileName, text);

            // Reading the content of the file
            String fileContent = Files.readString(fileName);

            // Printing the content inside the file
            System.out.println(fileContent);
        } catch (IOException e) {
            // Handling any I/O exceptions
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}