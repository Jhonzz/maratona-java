package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][1];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{4, 5, 6, 7, 8, 9, 10};

        arrayInt[0][0] = 23;
        arrayInt[0][1] = 32;
        //inicializando o arraymultidimensional diretamente

        int[][] arrayInt2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] arrayBase2 : arrayInt2){
            for (int num2 : arrayBase2){
                System.out.println(num2 + "\n-------\n");
            }
        }
        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }

    }
}
