package academy.devdojo.maratonajava.javacore.Gassociação.test;

import academy.devdojo.maratonajava.javacore.Gassociação.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociação.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador1= new Jogador("Bruno Henrique");
        Jogador jogador2= new Jogador("Everton Ribeiro");
        Time time = new Time("Flamengo");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador1.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}
