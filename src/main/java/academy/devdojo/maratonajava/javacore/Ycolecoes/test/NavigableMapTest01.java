package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("B", "Letra B");
        map.put("E", "Letra E");
        map.put("C", "Letra C");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(map.headMap("C", true)); //ira retornar todos abaixo do informado inclusive ele mesmo
        System.out.println(map.ceilingEntry("C"));
        System.out.println(map.higherEntry("C"));
        System.out.println(map.floorEntry("C"));
        System.out.println(map.lowerEntry("C"));

    }
}
