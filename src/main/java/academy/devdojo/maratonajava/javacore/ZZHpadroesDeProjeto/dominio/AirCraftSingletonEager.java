package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AirCraftSingletonEager {
//    Eager initializaton
    private static final AirCraftSingletonEager INSTANCE = new AirCraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public AirCraftSingletonEager(String name) {
        this.name = name;
    }
    {
        availableSeats.add("1B");
        availableSeats.add("1A");
    }

    public static AirCraftSingletonEager getINSTANCE(){
        return INSTANCE;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }

}
