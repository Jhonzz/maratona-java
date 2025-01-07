package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1. Order LightNovel by title
//2. Retrieve the first 3 light novels with price less than 4
public class StreamTest01 {
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
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }

            if (titles.size() >= 3){
                break;
            }
        }

        System.out.println(lightNovels);
        System.out.println("----------------------");
        System.out.println(titles);
    }
}
