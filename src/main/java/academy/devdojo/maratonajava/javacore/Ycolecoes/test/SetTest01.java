package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(123L, "Berserk", 30.00));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 9.99));
        mangas.add(new Manga(4L, "Pokemon", 10.20));
        mangas.add(new Manga(1231L, "One piece", 20.22));
        mangas.add(new Manga(312L, "Attack on titan", 12.10));

        for (Manga manga: mangas){
            System.out.println(manga);
        }



    }

}
