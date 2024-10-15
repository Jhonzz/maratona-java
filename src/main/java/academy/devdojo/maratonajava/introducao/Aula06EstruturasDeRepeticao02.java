package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000000
        for (int count = 0; count <= 1000000; count++){
            if(count % 2 == 0) {
                System.out.println(count);
            }
        }
    }
}
