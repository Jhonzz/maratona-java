package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carros disponiveis...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void devolvendoCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro "+carro);
        carrosDisponiveis.add(carro);
        System.out.println(carrosDisponiveis);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(carrosDisponiveis);
    }

}
