package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    private String dataDeValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calculaImposto(){
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
