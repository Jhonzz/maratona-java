package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim -inicio) + "ms");

        //padrão
        inicio = System.currentTimeMillis();
        concatString(10);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim -inicio) + "ms");

        // Builder
        inicio = System.currentTimeMillis();
        concatStringBuilder(10);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim -inicio) + "ms");

        // Buffer
        inicio = System.currentTimeMillis();
        concatStringBuffer(10);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim -inicio) + "ms");
    }


    private static void concatString(int tamanho){
        String texto = "ola";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder (int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    //usa-se em ambientes com acesso de multiplas threads/usuarios ao mesmo recurso
    private static void concatStringBuffer (int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
