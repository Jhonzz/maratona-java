package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Claudinei Ramos", "Claudin buxexa", "Roberto Gelo");
        List<String> developers = List.of("Jhon", "Fabricio", "Alessandre", "Alan", "Willian");
        List<String> students = List.of("Édipo", "João Carlos", "João Pedro", "Carlos José");

        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);


        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("------");
        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);

    }
}
