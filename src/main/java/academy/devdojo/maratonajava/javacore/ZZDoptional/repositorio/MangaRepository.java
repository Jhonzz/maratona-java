package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Dragon ball", 200), new Manga(2, "One piece", 2000),new Manga(3, "One punch man", 100));

    public static Optional<Manga> findById(Integer id){
        return findBy(manga -> manga.getId().equals(id));
    }

    public static Optional<Manga> findByName(String name){
        return findBy(manga -> manga.getName().equals(name));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;

        for (Manga manga : mangas){
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
