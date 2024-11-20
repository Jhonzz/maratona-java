package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Pasta criada? " + isDiretorioCreated);
//        File arquivoDiretorio = new File("C:\\Users\\jhonp\\IdeaProjects\\maratona-java\\pasta\\arquivo.txt");  OU
        File arquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = arquivoDiretorio.createNewFile();
        System.out.println("Arquivo.txt criado? " + isFileCreated);

        //RENOMEAR ARQUIVO
        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = arquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo.txt renomeado? " + isRenamed);

        //RENOMEAR DIRETORIO
        File diretorioRenamed = new File("folder");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio pasta renomeado? " + isDiretorioRenamed);

    }
}
