package org.dsa.fileOperations;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Arti Harde
 */
public class FileDescriptorDemo {

    public static void main(String[] args) throws IOException {
        try{
            byte[] buffer = {71,69,69,75,83};
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/demo/FileDescriptor.txt");
            // This getFD() method is called before closing the output stream
            FileDescriptor fileDescriptor = fileOutputStream.getFD();
            // writes byte to file output stream
            fileOutputStream.write(buffer);
            // USe of sync() : to sync data to the source file
            fileDescriptor.sync();
            System.out.print("\nUse of Sync Successful ");
            System.out.println("\n Id Valid File Descriptor : " + fileDescriptor.valid());
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}