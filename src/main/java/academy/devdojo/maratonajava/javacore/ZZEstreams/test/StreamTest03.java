package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
        private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("Dragon ball", 10.00),
                new LightNovel("Naruto", 3.99),
                new LightNovel("One piece", 1.99),
                new LightNovel("Dandadan", 10.00),
                new LightNovel("Bleach", 3.00),
                new LightNovel("Bleach", 3.00),
                new LightNovel("Jujutsu kaisen", 1.00),
                new LightNovel("Attack on titan", 20.00)
        ));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println); //lightNovel -> System.out.println(lightNovel)

        long count = stream.
                distinct().
                filter(lightNovel -> lightNovel.getPrice() <= 4).
                count();

        System.out.println(count);
    }
}
