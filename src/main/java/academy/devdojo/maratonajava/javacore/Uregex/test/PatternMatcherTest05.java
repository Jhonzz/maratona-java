package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = tudo oq não for digito
        // \s = Espaços em branco   \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // []                                                       com o - podemos indicar onde começar e onde terminar
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        //{n,m} de n até m
        //() Agrupamento
        // | o(v|c)o ovo | oco
        // $ Final do caminho
        // . 1.3 = 123, 133, 1@3, 1a3

        String regex = "([a-zA-Z\\d\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail";

        if ("zoro@mail.br".matches(regex)){
            System.out.println("email válido \n");
        }else System.out.println("email invalido \n");

        System.out.println(Arrays.toString(texto.split(",")));          // O split transformou em uma lista e o to string para uma lista de strings
//        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " +texto);
        System.out.println("índice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("posicoes encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+ matcher.group()+"\n");
        }
    }
}
