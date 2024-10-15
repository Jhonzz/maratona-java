package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraMeuTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double num1 = 4.5;
        double num2 = 465.43542345;
       double resultado = calculadora.divisao(num1, num2);

        System.out.println(resultado);
    }
}
