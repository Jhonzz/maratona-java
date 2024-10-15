package academy.devdojo.maratonajava.javacore.Dconstrutores.Test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime ("Haikyuu", "TV", 12,"Ação", "Production IG");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}
