package academy.devdojo.maratonajava.javacore.Hheranca.Test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
        // 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar classe filha
        // 2 - Alocado espaço em memória pro objeto da superclasse
        // 3 - Cada atributo de superclasse pai é criado com valores default ou o que for passado
        // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
        // 6 - Construtor é inicializado da superclasse
        // 7 - Alocado espaço em memória pro objeto da subclasse
        // 8 - Cada atributo de subclasse pai é criado com valores default ou o que for passado da classe
        // 9 - Bloco de inicialização da superclasse é executado na ordem em que aparece
        // 10 - Construtor é inicializado da superclasse
        Funcionario funcionario = new Funcionario("Jhon");
    }
}