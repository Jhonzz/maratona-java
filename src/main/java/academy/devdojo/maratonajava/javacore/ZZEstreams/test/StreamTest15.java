package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream().
                collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

//        Map<Category, List<Promotion>>
        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collect1);

        //transformando em um linkedHashSet para listar baseado na inserção
        Map<Category, LinkedHashSet<Promotion>> collectLinkedHashSet = lightNovels.stream().
                collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collectLinkedHashSet);

    }

        private static Promotion getPromotion(LightNovel ln){
            return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
        }

}
