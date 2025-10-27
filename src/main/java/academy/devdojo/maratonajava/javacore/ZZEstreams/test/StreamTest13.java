package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels.
                stream().
                collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);
        // Map<Category, Map<Promotion, List<LightNovel>>>

        System.out.println("-------");

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.
                stream().
                collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
        System.out.println(collect1);

    }
}

