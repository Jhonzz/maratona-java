package academy.devdojo.maratonajava.javacore.ZZKJunit.domain;

import java.util.Objects;

public record Manga(String name, int episodes) {
    public Manga{
        Objects.requireNonNull(name);
    }
}
