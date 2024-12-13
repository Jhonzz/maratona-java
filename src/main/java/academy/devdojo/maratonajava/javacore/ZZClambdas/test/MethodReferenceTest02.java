package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Jujutsu kaisen", 65), new Anime("Berserk", 50), new Anime("Dandadan", 9), new Anime("Naruto", 300)));

        animeList.sort(animeComparator::compareByEpisodesNonStatic);
        animeList.sort((a1, a2) -> animeComparator.compareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);

        }
}
