package ro.fasttrackit.course16.homework;

import ro.fasttrackit.course16.homework.exceptions.PersonNotFoundException;
import ro.fasttrackit.course16.homework.exceptions.PersonValidationException;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private static int ID_COUNTER = 1;
    private final List<Person> people;

    public PersonService(List<Person> people) {
        this.people = new ArrayList<>(people);
    }

    public Person addPerson(Person newPerson) {
        validatePerson(newPerson);
        Person person = Person.builder()
                .id(ID_COUNTER++)
                .age(newPerson.age())
                .name(newPerson.name())
                .build();
        people.add(person);
//        people.add(newPerson.withId(ID_COUNTER++));
        return person;
    }

    public Person removePerson(int id) {
        Person personToRemove = getPersonById(id);
        if (personToRemove == null) {
            throw new PersonNotFoundException("Could not find person with id %s".formatted(id));
        }
        people.remove(personToRemove);
        return personToRemove;
    }

    public List<Person> getPeopleOlderThan(int age) {
        if (age < 0 || age > 120) {
            throw new RuntimeException("Invalid age parameter value");
        }

        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.age() == age) {
                result.add(person);
            }
        }

        return result;
    }

    public Person getPersonById(int id) {
        for (Person person : people) {
            if (person.id() == id) {
                return person;
            }
        }
        return null;
    }

    private void validatePerson(Person person) {
        if (person.name() == null || person.name().isEmpty()) {
            throw new PersonValidationException("Invalid name was introduced");
        }

        if (person.age() == null || person.age() < 0 || person.age() > 120) {
            throw new PersonValidationException("Invalid age was introduced");
        }
    }
}
