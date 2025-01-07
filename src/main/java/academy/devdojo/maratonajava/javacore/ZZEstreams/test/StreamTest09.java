package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.range(0, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.rangeClosed(0, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream.of("Testing", " stream ", "of", " Strings").
                map(String::toUpperCase).
                forEach(System.out::print);
        System.out.println();

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(numbers)
                .average().
                ifPresent(System.out::println);

        try(Stream<String> lines = Files.lines(Paths.get("file.txt"))){

            lines.filter(row -> row.contains("java")).forEach(System.out::println);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
