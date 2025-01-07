package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Dragon ball", 10.00),
            new LightNovel("Naruto", 3.99),
            new LightNovel("One piece", 1.99),
            new LightNovel("Dandadan", 8.00),
            new LightNovel("Bleach", 3.00),
            new LightNovel("Bleach", 3.00),
            new LightNovel("Jujutsu kaisen", 1.00),
            new LightNovel("Attack on titan", 20.00)
    ));

    public static void main(String[] args) {
        lightNovels.stream().map(LightNovel::getPrice). // é transformado em um wrapper automaticamente
                filter(price -> price > 3).
                reduce(Double::sum).
                ifPresent(System.out::println);


        double sum = lightNovels.stream(). //Stream<Double>
                mapToDouble(LightNovel::getPrice). //evita que o java transforme um tipo primitivo em wrapper, melhorando a performance
                filter(price -> price > 3).
                sum();

        System.out.println(sum);
    }
}
