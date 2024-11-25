package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Willian");
        Consumidor consumidor2 = new Consumidor("Devdojo Academy");

        Manga manga1 = new Manga(123L, "Berserk", 30.00);
        Manga manga2 = new Manga(3L, "Hellsing Ultimate", 9.99);
        Manga manga3 = new Manga(4L, "Pokemon", 10.20);
        Manga manga4 = new Manga(1231L, "One piece", 20.22);
        Manga manga5 = new Manga(312L, "Attack on titan", 12.10);

        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga4, manga5);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(consumidor, mangaConsumidor1List);
        consumidorMangaMap.put(consumidor2, mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println("-----" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("-----" +manga.getNome());
            }

        }

    }

}
