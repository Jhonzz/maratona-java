package academy.devdojo.maratonajava.javacore.LclassesAbstratas.domain;

//final para não poder ser extendidas
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    public void imprime(){
        System.out.println("Imprimindo...");
    }
    public abstract void calculaBonus();
}
