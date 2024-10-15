package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 números de um dado valor, por exemplo 50
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
};
