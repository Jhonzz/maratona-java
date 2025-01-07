package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> shounen = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> fantasy = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case SHOUNEN -> shounen.add(lightNovel);
                case DRAMA -> drama.add(lightNovel);
                case FANTASY -> fantasy.add(lightNovel);
            }
        }
        categoryLightNovelMap.put(Category.SHOUNEN, shounen);
        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        System.out.println(categoryLightNovelMap);

        System.out.println("--------");

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
