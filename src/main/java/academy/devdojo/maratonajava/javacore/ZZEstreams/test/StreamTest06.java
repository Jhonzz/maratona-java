package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(lightNovels.stream().anyMatch(lightNovel -> lightNovel.getPrice() > 99)); // algum combina com o predicate informado?
        System.out.println(lightNovels.stream().noneMatch(lightNovel -> lightNovel.getPrice() > 0)); // algum não combina com o predicate informado?
        System.out.println(lightNovels.stream().allMatch(lightNovel -> lightNovel.getPrice() < 0)); // todos combinam com o predicate informado?
        lightNovels.stream().
                filter(lightNovel -> lightNovel.getPrice() > 10).
                findAny(). //procura qualquer um baseado no filtro informado
                ifPresent(System.out::println); //ifPresent disponivel pois o findAny é um optional

        lightNovels.stream().
                filter(ln -> ln.getPrice() > 3).
                sorted(Comparator.comparing(LightNovel::getPrice).reversed()).
                findFirst().
                ifPresent(System.out::println);

        lightNovels.stream().
                filter(ln -> ln.getPrice() > 3).min(Comparator.comparing(LightNovel::getPrice)).
                ifPresent(System.out::println);


    }
}
