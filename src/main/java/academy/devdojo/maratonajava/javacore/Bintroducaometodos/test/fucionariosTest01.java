package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Funcionarios;

public class fucionariosTest01 {
    public static void main(String[] args) {
        Funcionarios funcionario01 = new Funcionarios();

        funcionario01.setNome("Jhon Pablo");
        funcionario01.setIdade(17);
        funcionario01.setSalarios(new double[]{1300.33,900.21, 3000,});
        funcionario01.imprimirDados();
    }
}
