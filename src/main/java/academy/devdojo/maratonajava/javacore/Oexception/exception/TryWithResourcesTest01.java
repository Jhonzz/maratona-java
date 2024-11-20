package academy.devdojo.maratonajava.javacore.Oexception.exception;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Leitor2;

import java.io.*;

// Só se pode colocar objs ou variaveis de referencias dentro do try with resources q implementem a interface closeable ou autocloaseable
// Então não precisa se preocupar com o finally para fechar
// Objetos são fechados na ordem inversa q foram declarados


public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo2();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("teste.txt "));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}