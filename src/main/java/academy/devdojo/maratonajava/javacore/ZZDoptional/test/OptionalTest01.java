package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("testando nullpointer exception");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.ofNullable(null);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-------------");

//        Optional<String> nameOptional = Optional.ofNullable(findName("Bruno"));
        Optional<String> nameOptional = findName("Willian");
        String empty = nameOptional.orElse("É empty");
        System.out.println(empty);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("Bruno", "Jhon", "Willian");

        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
