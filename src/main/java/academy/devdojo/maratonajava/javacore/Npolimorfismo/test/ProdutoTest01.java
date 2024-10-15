package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Televisão;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Pichau gamer", 7000.00);
        Tomate tomate = new Tomate("Tomate Híbrido Wanda", 10);
        Televisão tv = new Televisão("Samsung 50\"", 5000.0);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }

}
