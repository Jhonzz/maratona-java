package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

public class Funcionario extends Pessoa{
    public void salvar() throws LoginInvalidoException, ArithmeticException {
        System.out.println("Salvando funcionário");
    }
}
