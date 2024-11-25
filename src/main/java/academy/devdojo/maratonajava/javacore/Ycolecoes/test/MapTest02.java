package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Willian");
        Consumidor consumidor2 = new Consumidor("Devdojo Academy");

        Manga manga1 = new Manga(123L, "Berserk", 30.00);
        Manga manga2 = new Manga(3L, "Hellsing Ultimate", 9.99);
        Manga manga3 = new Manga(4L, "Pokemon", 10.20);
        Manga manga4 = new Manga(1231L, "One piece", 20.22);
        Manga manga5 = new Manga(312L, "Attack on titan", 12.10);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor, manga2);
        consumidorManga.put(consumidor2, manga5 );

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + ": " + entry.getValue().getNome());
        }
    }

}
