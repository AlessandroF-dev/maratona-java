package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    private Person notAdult;
    private Person adult;
    private PersonService personService;

    @BeforeEach
    public void setUp() {
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void shouldReturnFalseWhenAgeIsLowerThan18() {
        assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be adult when age is greather or equal than 18")
    void shouldReturnTrueWhenAgeIsGreatherOrEqualThan18() {
        assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message when person is null")
    void shouldReturnThrowExceptionWhenPersonIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> personService.isAdult(null), "Person can't be null");
    }
    @Test
    @DisplayName("Should return list with only adults")
    void shouldFilterRemovingNotAdultReturnListWithAdultOnlyWhenListOfPersonWithAdultIsPassed() {
        Person person1 = new Person(17);
        Person person2 = new Person(18);
        Person person3 = new Person(21);
        List<Person> personList = List.of(person1, person2, person3);

        assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }
}