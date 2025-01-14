package academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesDeProjeto.dominio.Person;

public class BuildPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder.
                builder().
                firstName("Jhon").
                lastName("Pablo").
                email("Jhon@teste.com").
                username("Jhonzz").
                build();
        System.out.println(build);

    }
}
