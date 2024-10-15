package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização estático é executado quando a JVM carregar classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado com valores default ou o que for passada
    // 3 - Bloco de inicialização
    // 4 - Construtor é inicializado
    static {
        System.out.println("Dentro do bloco de inicialização estatico 1");
        episodios = new int[1031];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estatico 2");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estatico 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico 4");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
