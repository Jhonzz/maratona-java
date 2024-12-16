package academy.devdojo.maratonajava.javacore.ZZDoptional.dominio;

public class Manga {
    private Integer id;
    private String name;
    private int chapters;

    public Manga(Integer id, String name, int chapters) {
        this.id = id;
        this.name = name;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chapters=" + chapters +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getChapters() {
        return chapters;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }


}
