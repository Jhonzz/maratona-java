package academy.devdojo.maratonajava.javacore.Gassociação.test;

import academy.devdojo.maratonajava.javacore.Gassociação.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociação.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociação.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociação.domain.Seminario;

public class AssociaçãoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Aluno aluno2 = new Aluno("Ace", 22);
        Aluno aluno3 = new Aluno("Sabo", 20);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno, aluno2, aluno3};

        Seminario seminario = new Seminario("Onde achar o One Piece", local, alunosParaSeminario);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
