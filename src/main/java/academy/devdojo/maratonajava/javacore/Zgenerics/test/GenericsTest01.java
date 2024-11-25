package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Okarun");
        lista.add("Okarun");

        for (String o : lista) {
            System.out.println(o);
        }

        add(lista, new Consumidor("okarun"));

        for (Object o : lista) {
            System.out.println(o);
        }


    }

    public static void add(List list, Consumidor consumidor){
        list.add(consumidor);
    }

}
