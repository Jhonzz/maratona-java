package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // doar se o salario for maior que 5000

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Eu não vou doar os 500 reais";
        // (condicao) ? verdadeiro : falso
        //ternario

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
