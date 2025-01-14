package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.AirCraftSingletonEager;

public class AirCraftTest01 {
    public static void main(String[] args) {

    }
    public static void bookSeat(String seat){
        System.out.println(AirCraftSingletonEager.getINSTANCE());
//        Aircraft aircraft = new Aircraft();
//        System.out.println(aircraft.bookSeats(seat));
    }
}
