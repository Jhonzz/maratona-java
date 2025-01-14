package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {

    private String name;
    private final static Set<String> availableSeats = new HashSet<>();
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeats(String seat){
        return availableSeats.remove(seat);
    }

    public Aircraft(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
