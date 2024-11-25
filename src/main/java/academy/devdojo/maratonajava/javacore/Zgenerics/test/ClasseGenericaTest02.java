package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando barco por 1 mês...");
        barcoRentavelService.devolvendoBarcoAlugado(barco);
    }
}
