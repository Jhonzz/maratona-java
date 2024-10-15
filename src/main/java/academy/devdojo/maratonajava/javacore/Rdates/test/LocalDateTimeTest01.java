package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2023-03-07");
        LocalTime time = LocalTime.parse("16:30:50");
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime ldt1 = date.atTime(time);                  //PARA JUNTAR A DATA COM O TEMPO
        LocalDateTime ldt2 = time.atDate(date);
        System.out.println(ldt2);
        System.out.println(ldt1);
    }
}
