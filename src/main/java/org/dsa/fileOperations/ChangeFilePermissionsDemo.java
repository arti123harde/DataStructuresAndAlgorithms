package org.dsa.fileOperations;

import java.io.File;
import java.io.FileReader;

/**
 * @author Arti Harde
 */
public class ChangeFilePermissionsDemo {

    public static void main(String[] args) throws Exception {
        try {
            File file = new File("src/main/resources/demo/demo.txt");
            boolean isExists = file.exists();
            if(isExists){
                System.out.println(file.canExecute());
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                file.setReadable(false);
                file.setWritable(true);
                file.setExecutable(false);
                FileReader fileReader = new FileReader(file);
                int i ;
                while ((i = fileReader.read()) != -1)
                    System.out.print((char)i);
            }
        }catch (Exception ex){
            System.out.println(ex.getClass());
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
        }
    }
}