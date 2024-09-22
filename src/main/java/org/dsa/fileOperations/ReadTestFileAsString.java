package org.dsa.fileOperations;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Arti Harde
 */
public class ReadTestFileAsString {


    public static void main(String[] args) throws Exception
    {
        String data = new String(Files.readAllBytes(Paths.get("src/main/resources/demo.txt")));
        System.out.println(data);
    }
}