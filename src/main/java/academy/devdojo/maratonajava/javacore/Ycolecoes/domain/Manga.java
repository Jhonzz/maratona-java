package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;


public class Manga implements Comparable<Manga> {
    private Long id;
    private String nome;

    private double preco;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser vazio");
        Objects.requireNonNull(nome, "Nome do mangá não pode ser vazio");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    @Override
    public int compareTo(Manga outroManga) {
        // negativo se o this < outroManga
        // se this ==outro manga, return 0
        // positivo se this > outroManga
//        if (this.id < outroManga.getId()) {
//            return -1;
//        } else if (this.id.equals(outroManga.id)) {
//            return 0;
//        } else return 1;

        //FAZENDO USANDO AS CLASSES DO PROPRIO JAVA

        return this.nome.compareTo(outroManga.nome);    //Organizando em ordem alfabetica
//        return Double.compare(preco, outroManga.getPreco());  //Organizando do valor mais barato para o mais caro
//        return Double.valueOf(preco).compareTo(outroManga.getPreco());  //mesma coisa da linha acima(mais recomendado usar o exemplo acima)
//        return this.id.compareTo(outroManga.getId());   //Organiza do menor para o maior com base no ID
    }
}

