package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Jhon";
        nome.concat(" Pablo");
        nome = nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Jhon");       // Ele ja vem com um toString implantado
        sb.append("Jhon").append("Pablo"); //ao inves de sb = nome ou sb = ""
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);

    }
}
