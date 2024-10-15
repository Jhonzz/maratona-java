package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros= {1,2,3,4,5};
        calculadora.somaVarArgs(1,2,3,4,5); //com o var args o código fica mais limpo, ele automaticamente vira um array
        calculadora.somaArray(numeros);
    }
}
