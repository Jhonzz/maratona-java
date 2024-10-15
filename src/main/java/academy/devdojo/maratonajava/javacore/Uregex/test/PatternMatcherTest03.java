package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = tudo oq não for digito
        // \s = Espaços em branco   \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // []                                                       com o - podemos indicar onde começar e onde terminar

//        String regex = "[a-zA-C]";
        String regex = "0[xX][\\daA-Ff]";
//        String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " +texto2);
        System.out.println("índice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("posicoes encontradas");

        while (matcher.find()){
            System.out.print(matcher.start()+" "+" "+ matcher.group()+"\n");
        }
        int numeroHexadecimal = 0x59F86A;
        System.out.println(numeroHexadecimal);

    }
}
