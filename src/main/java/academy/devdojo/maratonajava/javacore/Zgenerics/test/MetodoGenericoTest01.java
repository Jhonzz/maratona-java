package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarUmArrayComUmObjeto(new Barco("Canoa"));
        System.out.println(barcoList);
    }

    private static <T> List<T> criarUmArrayComUmObjeto(T t){
        List<T> list = List.of(t);
        return list;
    }
//    private static <T extends Comparable<T>> List<T> criarUmArrayComUmObjeto(T t){  aceita apenas objetos que possuam Comparable
//        List<T> list = List.of(t);
//        return list;
//    }

}