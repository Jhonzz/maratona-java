package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carroPW = new Carro();
        Carro carroBugatti = new Carro();

        carroPW.nome = "Porsche Carrera GT";
        carroPW.modelo = "Nissan Skyline R34 MotoRex GT-R V-spec II";
        carroPW.ano = 2001;

        carroBugatti.nome = "Bugatti Veyron EB 16.4";
        carroBugatti.modelo = "Coupé de duas portas (16.4, Super Sport)";
        carroBugatti.ano = 2005;

        carroPW = carroBugatti;

        System.out.println("Nome: " + carroPW.nome + "\nModelo: " + carroPW.modelo + "\nAno: " + carroPW.ano + "\n");
        System.out.println("Nome: " + carroBugatti.nome + "\nModelo: " + carroBugatti.modelo + "\nAno: " + carroBugatti.ano);
    }
}
