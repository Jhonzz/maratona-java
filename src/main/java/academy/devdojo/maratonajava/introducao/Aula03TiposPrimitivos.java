package academy.devdojo.maratonajava.introducao;
/* Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

import java.util.Date;

public class Aula03TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Jhon";
        String sobrenome = "Pablo";
        String endereço = "Alterio Sordi";
        Double salario = 2000.00;
        String dataRecebimento = "05/10/2022";
        String relatorio = "Eu " +nome + ", morando no endereço " +endereço+ " confirmo que recebi o salário de "+salario+ ", na data "+ dataRecebimento;

        System.out.println(relatorio);
    }
}
