package academy.devdojo.maratonajava.javacore.Gassociação.test;

import academy.devdojo.maratonajava.javacore.Gassociação.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassociação.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Sandra");
        Professor professor2 = new Professor("Josemar");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Pacaembu", professores);

        escola.imprime();
    }
}
