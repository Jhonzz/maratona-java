package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
       return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(123L, "Berserk", 30.00));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 9.99));
        mangas.add(new Manga(4L, "Pokemon", 10.20));
        mangas.add(new Manga(1231L, "One piece", 20.22));
        mangas.add(new Manga(312L, "Attack on titan", 12.10));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Collections.sort(mangas);

        System.out.println("----------------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//      Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());             //nesse exemplo se precisa de um comparator como argumento

        System.out.println("----------------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }

}