package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Dragon ball", 10.00),
            new LightNovel("Naruto", 3.99),
            new LightNovel("One piece", 1.99),
            new LightNovel("Dandadan", 10.00),
            new LightNovel("Bleach", 4.99),
            new LightNovel("Jujutsu kaisen", 1.00),
            new LightNovel("Attack on titan", 20.00)
    ));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());
        System.out.println(titles);
    }
}
