package ro.fasttrackit.course16.homework;

import lombok.Builder;

//@With
@Builder
public record Person(
        Integer id,
        String name,
        Integer age
) implements Comparable<Person> {
    @Override
    public int compareTo(Person o) {
        return age.compareTo(o.age);
    }
}
