package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,2);

        System.out.println("Código finalizado");
    }

      /**
       *@param a
       *@param b não pode ser zero
       *@return
       * @throws IllegalArgumentException caso b seja zero
       * */
    private static int divisao(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}