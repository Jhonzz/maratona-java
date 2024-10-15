package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5}; // Valor ja inicializado no proprio indice
        int[] numeros3 = new int[]{5,4,3,2,1};

//        for (int i = 0; i < numeros2.length; i++) {
//            System.out.println(numeros3[i]);
//        }

        for(int num : numeros3){
            System.out.println(num);
            // int num = numeros[0]
            // System.out.println(num);
            //num = numeros[1]
            //System.out.println(num);
            // ...
        }
    }
}
