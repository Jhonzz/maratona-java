package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/jhon");
        Path clazz = Paths.get("/home/jhon/dev/olaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolute1 = Paths.get("/home/jhon");
        Path absolute2 = Paths.get("usr/local");
        Path absolute3 = Paths.get("/home/jhon/dev/olaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.198291");

        System.out.println("1 " + absolute1.relativize(absolute3));
        System.out.println("2 " + absolute3.relativize(absolute1));
        System.out.println("4 " + relativo1.relativize(relativo2));
    }
}