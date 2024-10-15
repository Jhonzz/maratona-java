package academy.devdojo.maratonajava.javacore.CSobrecargaDeMetodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(){

    }

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(String nome) {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpidodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios(int episodios) {
        return episodios;
    }

    public String getTipo(String tipo) {
        return tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}