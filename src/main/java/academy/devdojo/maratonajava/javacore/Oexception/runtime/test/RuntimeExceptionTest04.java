package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

// Capturando multiplas excessões
//Excessões mais genéricas terão que vir por último por exemplo runtimeExceíon q é pai de todas as outras
public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();

        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro de RuntimeException");
        }


        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();}
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {
    }
}




