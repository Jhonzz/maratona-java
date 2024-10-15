package academy.devdojo.maratonajava.javacore.Gassociação.test;

import java.util.Scanner;

public class LeituraDoTeclado02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("\n Digite sua pergunta e eu responderei com sim ou não");
        char pergunta = input.nextLine().charAt(0);
        if (pergunta == ' '){
            System.out.println("SIM");
        }else System.out.println("NÃO");


    }
}
