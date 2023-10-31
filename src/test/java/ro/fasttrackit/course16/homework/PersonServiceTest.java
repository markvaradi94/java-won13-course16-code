package ro.fasttrackit.course16.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ro.fasttrackit.course16.homework.exceptions.PersonValidationException;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonServiceTest {

    private static PersonService service;

    @BeforeAll
    static void setupAll() {
        List<Person> people = List.of(
                Person.builder()
                        .id(1)
                        .name("Levi")
                        .age(50)
                        .build(),
                Person.builder()
                        .id(2)
                        .name("Nimrod")
                        .age(22)
                        .build(),
                Person.builder()
                        .id(3)
                        .name("Andrei")
                        .age(20)
                        .build()
        );

        service = new PersonService(people);
    }

    @Test
    void addInvalidPersonTest() {
        Person paul1 = Person.builder()
                .name("Paul")
                .age(121)
                .build();

//        Person result = service.addPerson(paul1);
//
//        assertThat(result).isNotNull();
        assertThatThrownBy(() -> service.addPerson(paul1))
                .isInstanceOf(PersonValidationException.class)
                .hasMessage("Invalid age was introduced");

        assertThrows(PersonValidationException.class,
                () -> service.addPerson(paul1));
    }
}