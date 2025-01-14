package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.AirCraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AirCraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AirCraftSingletonLazy.getINSTANCE());
        System.out.println(AirCraftSingletonLazy.getINSTANCE());
        Constructor<AirCraftSingletonLazy> constructor = AirCraftSingletonLazy.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AirCraftSingletonLazy airCraftSingletonLazy = constructor.newInstance("787-900");
        System.out.println(airCraftSingletonLazy);
    }

    private static void bookSeat(String seat) {
        System.out.println(AirCraftSingletonLazy.getINSTANCE());
        AirCraftSingletonLazy aircraft = AirCraftSingletonLazy.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
