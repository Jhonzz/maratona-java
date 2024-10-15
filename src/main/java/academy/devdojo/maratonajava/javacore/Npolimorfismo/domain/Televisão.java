package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Televisão extends Produto{
    public Televisão(String nome, double valor) {
        super(nome, valor);
    }
    public static final double IMPOSTO_POR_CENTO = 0.21;
    @Override
    public double calculaImposto() {
        System.out.println("Calculando o imposto da televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
