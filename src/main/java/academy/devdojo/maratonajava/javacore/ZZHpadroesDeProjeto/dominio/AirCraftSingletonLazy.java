package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AirCraftSingletonLazy {
    //Eager initializaton
    private static AirCraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AirCraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("1B");
        availableSeats.add("1A");
    }

    public static AirCraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AirCraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AirCraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
