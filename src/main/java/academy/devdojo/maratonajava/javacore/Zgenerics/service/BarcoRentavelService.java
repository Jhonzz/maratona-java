package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando barcos disponiveis...");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " + barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void devolvendoBarcoAlugado(Barco barco){
        System.out.println("Devolvendo Barco "+barco);
        barcosDisponiveis.add(barco);
        System.out.println(barcosDisponiveis);
        System.out.println("Barcos disponiveis para alugar:");
        System.out.println(barcosDisponiveis);
    }

}
