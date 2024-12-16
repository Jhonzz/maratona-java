package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.EmptyStackException;
import java.util.Optional;

import static academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository.findById;
import static academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository.findByName;

public class OptionalTest02 {
    public static void main(String[] args) {

        Optional<Manga> mangaByTitle = findByName("Dragon ball");

        mangaByTitle.ifPresent(m -> m.setName("Dragon ball 2"));
        System.out.println(mangaByTitle);

        Manga manga = findById(1).orElseThrow(EmptyStackException::new);
        System.out.println(manga);

        Manga newManga = findByName("Dandadan").orElse(new Manga(4, "DandaDan", 10));
        System.out.println(newManga);
    }
}
