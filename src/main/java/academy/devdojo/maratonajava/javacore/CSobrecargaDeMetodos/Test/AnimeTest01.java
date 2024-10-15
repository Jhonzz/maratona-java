package academy.devdojo.maratonajava.javacore.CSobrecargaDeMetodos.Test;

import academy.devdojo.maratonajava.javacore.CSobrecargaDeMetodos.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama", "TV", 12, "Ação");
        anime.imprime();
    }
}
