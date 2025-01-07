package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_00;

        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }

    private static void sumFor(Long num){
        System.out.println("Sum for");

        long result = 0;
        long init = System.currentTimeMillis();
        for (long i = 1; i <= num; i++){
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumStreamIterate(Long num) {
        System.out.println("Sum streamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

    private static void sumParallelStreamIterate(Long num){
        System.out.println("Sum parallelStreamIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    private static void sumLongStreamIterate(Long num){
        System.out.println("Sum LongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(0L, num).reduce(0L, Long::sum); //O sistema não ira mudar o tipo automaticamente e ja passando um valor limit estabelecido atraves do rangeClosed melhora o processamento
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }
    private static void sumParallelLongStreamIterate(Long num){
        System.out.println("Sum parallelLongStreamIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(0L, num).parallel().reduce(0L, Long::sum); //O sistema não ira mudar o tipo automaticamente e ja passando um valor limit estabelecido atraves do rangeClosed melhora o processamento
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms");
    }

}
