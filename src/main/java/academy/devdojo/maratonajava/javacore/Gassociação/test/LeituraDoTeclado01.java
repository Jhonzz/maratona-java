package academy.devdojo.maratonajava.javacore.Gassociação.test;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Coloque seu user logo abaixo");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();

        System.out.println("Digite M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);

        System.out.println("-------------------------------------------------------" );

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

    }
}
