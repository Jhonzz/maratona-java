package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12);
        LocalTime timenow = LocalTime.now();
        System.out.println(time);
        System.out.println(timenow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(timenow.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);              // MUITO USADO EM RELATÓRIOS
        System.out.println(timenow.withNano(0));                    //SE NÃO QUISER COM NANOSEGUNDOS
    }
}
