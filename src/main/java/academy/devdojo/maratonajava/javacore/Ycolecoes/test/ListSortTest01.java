package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("One piece");
        mangas.add("Attack on titan");

        Collections.sort(mangas); // Organiza os valores em ordem alfabetica, menor pra maior etc

        List<Double> dinheiros = new ArrayList<>(6);
        dinheiros.add(100.00);
        dinheiros.add(012.00);
        dinheiros.add(90D);


        for (String manga : mangas){
            System.out.println(manga);
        }
        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);

        new Manga(1234123L, null, 0);
    }
}
