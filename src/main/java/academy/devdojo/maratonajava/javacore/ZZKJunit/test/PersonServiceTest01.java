package academy.devdojo.maratonajava.javacore.ZZKJunit.test;

import academy.devdojo.maratonajava.javacore.ZZKJunit.domain.Person;
import academy.devdojo.maratonajava.javacore.ZZKJunit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(19);
        PersonService personService = new PersonService();
        log.info("Is adult? '{}'", personService.isAdult(person));
    }
}
