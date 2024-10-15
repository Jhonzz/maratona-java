package academy.devdojo.maratonajava.javacore.Oexception.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }


    private static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean IsCriado = file.createNewFile();
            if (IsCriado == true){
                System.out.println("Arquivo criado " + IsCriado);
            }else System.out.println("Arquivo não criado");

        } catch (IOException e) {
            e.printStackTrace();
            throw e; //ou new RuntimeException("Problema na hora de criar o arquivo");
        }
    }
}
// Se a function for privada é melhor usar o try catch, caso contrário usar throws exception