package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        // 31,28,31,30 dias
        int[][] dias = new int [3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        dias[2][0] = 25;
        dias[2][1] = 31;
        dias[2][2] = 29;

//        for (int i = 0; i < dias.length; i++) {
//            for (int j = 0; j < dias[i].length; j++) {
//                System.out.println(dias[i][j]); // O i é o primeiro valor e o j o segundo valor
//            }
//
        System.out.println("---------------------------------------------");
        // For Each

        for(int[] arraBase: dias){
            for (int num: arraBase){
                System.out.println(num);
            }
        }
    }
}
