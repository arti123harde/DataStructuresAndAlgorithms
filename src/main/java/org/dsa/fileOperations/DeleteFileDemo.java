package org.dsa.fileOperations;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Arti Harde
 */
public class DeleteFileDemo {

    public static void main(String[] args) {
        try{
            Files.deleteIfExists(Paths.get("src/main/resources/demo/demo2"));
        }catch (Exception ex){
            System.out.println(ex.getClass());
            System.out.println(ex.getMessage());
        }
    }
}