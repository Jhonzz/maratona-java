package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
                  //Padrão
    //byte, short, int, long, float e double 0
    //char '\u0000' = ''
    //boolean false
    //String null

    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
