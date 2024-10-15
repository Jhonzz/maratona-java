package academy.devdojo.maratonajava.javacore.JmodificadorFinal.domain;

public class Ferrari extends Carro{
    public final void imprime2(){
        super.imprime();
        System.out.println("Test");
    }
}
