package academy.devdojo.maratonajava.javacore.Oexception.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean IsCriado = file.createNewFile();
            System.out.println("Arquivo criado" + IsCriado);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
