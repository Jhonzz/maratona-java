package academy.devdojo.maratonajava.javacore;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class VioTest01 {
    public static void main(String[] args) {
        File file = new File("file.text");
        try {

            boolean isCreated = file.createNewFile();
            System.out.println("Created: " +isCreated);
            System.out.println("path: " +file.getPath());
            System.out.println("Absolute path: " +file.getAbsolutePath());
            System.out.println("is directory: " +file.isDirectory());
            System.out.println("is file: " +file.isFile());
            System.out.println("is hidden: " +file.isHidden());
            System.out.println("last modified: "+ Instant.ofEpochSecond(file.lastModified()).atZone(ZoneId.systemDefault()));
//            System.out.println("last modified: " +new Date(file.lastModified()));
            boolean exists = file.exists();

            if (exists){
                System.out.println("Deleted: "+ file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
