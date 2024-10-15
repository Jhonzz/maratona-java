package academy.devdojo.maratonajava.javacore.Vio.test;
//File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Testando write\n Continuando teste, mas na linha debaixo\n");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
