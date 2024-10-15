package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000l;
        long numeroGrande = 100000l;
        double salarioDouble = (double) 2000f;
        float salarioFloat = 2500.0f; //f para mostrar q é um float
        byte idadeByte = 0;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere ='\u0041'; //Pode colocar uma letra ou numero ou um codigo unicode ou outro tipo de simbolo
        String nome = "Jhon";

        System.out.println("A idade é " + age + " anos");
        System.out.println(falso);
        System.out.println("char " +caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome é " + nome);
    }};
