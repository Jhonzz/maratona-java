package academy.devdojo.maratonajava.javacore.ZZKJunit.service;

import academy.devdojo.maratonajava.javacore.ZZKJunit.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class PersonServiceTest {
    private Person adult;
    private Person notAdult;
    private PersonService personService;

    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }
    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }
    @Test
    @DisplayName("A person should be adult when age is lower than 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEquals18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException when Person is null")
    void isAdult_ThrowNullPointerException_WhenPersonIsNull(){
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> personService.isAdult(null), "Person can't be null");
    }
    @Test
    @DisplayName("Should return list with only adults")
    void filterRemovingNotAdult_ReturnAListWithAdults(){
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(19);
        List<Person> personList = List.of(person1, person2, person3);
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }


}