package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.AirCraftSingletonEager;

public class AirCraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1B");
        AirCraftTest01.bookSeat("1A");
    }

    private static void bookSeat(String seat) {
        System.out.println(AirCraftSingletonEager.getINSTANCE());
        AirCraftSingletonEager aircraft = AirCraftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
