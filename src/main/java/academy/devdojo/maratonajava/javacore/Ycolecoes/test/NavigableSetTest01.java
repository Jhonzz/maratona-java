package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


 class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }

}

class MangaCompareByPreco implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest01 {

    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaCompareByPreco());
        mangas.add(new Manga(123L, "Berserk", 30.00));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 9.99));
        mangas.add(new Manga(4L, "Pokemon", 32.2));
        mangas.add(new Manga(1231L, "One piece", 20.22));
        mangas.add(new Manga(312L, "Attack on titan", 12.10));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga dandadan = new Manga(2L, "Dan da Dan", 30.2);

        //lower <
        //floor <=
        //higher >
        //ceiling >=

        System.out.println("----------------");
        System.out.println(mangas.lower(dandadan));
        System.out.println(mangas.floor(dandadan));
        System.out.println(mangas.higher(dandadan));
        System.out.println(mangas.ceiling(dandadan));


        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); //remove o primeiro item da lista pollLast remove o ultimo
        System.out.println(mangas.size());
    }
}
