package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/exemplo/dev/jhon";
        String arquivotxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivotxt);
        System.out.println(path1);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("/home/./jhon");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
