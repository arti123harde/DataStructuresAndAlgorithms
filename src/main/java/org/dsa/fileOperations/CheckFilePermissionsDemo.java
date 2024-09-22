package org.dsa.fileOperations;

import java.io.File;

/**
 * @author Arti Harde
 */
public class CheckFilePermissionsDemo {

    public static void main(String[] args) throws Exception {
        File file = new File("src/main/resources/demo/demo.txt");
        boolean isExists = file.exists();
        if(isExists){
            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
        }
    }
}