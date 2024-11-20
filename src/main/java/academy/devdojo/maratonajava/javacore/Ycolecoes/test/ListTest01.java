package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(16);           // Não existia o "<>" antes da versão 1.4 do java, ele indica do que essa lista vai ser, nesse caso String
        List<String> nomes2 = new ArrayList(16);           // Não existia o "<>" antes da versão 1.4 do java, ele indica do que essa lista vai ser, nesse caso String
        nomes.add("Jhon");
        nomes.add("Pablo");
        nomes2.add("Pablo");
        nomes2.add("carl");

//       System.out.println(nomes.remove("jhon"));
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);

        }
        System.out.println("----------------------");


        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

    }
}
