package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Dragon ball", 10.00, Category.SHOUNEN),
            new LightNovel("Naruto", 3.99, Category.SHOUNEN),
            new LightNovel("One piece", 1.99, Category.SHOUNEN),
            new LightNovel("Dandadan", 10.00, Category.FANTASY),
            new LightNovel("Bleach", 4.99, Category.DRAMA),
            new LightNovel("Jujutsu kaisen", 1.00, Category.SHOUNEN),
            new LightNovel("Jujutsu kaisen", 1.00, Category.SHOUNEN),
            new LightNovel("Attack on titan", 20.00, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.
                stream().
                collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        //retornar um Lightnovel ao inves de um optional de LightNovel
        Map<Category, LightNovel> collect2 = lightNovels.
                stream().
                collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
