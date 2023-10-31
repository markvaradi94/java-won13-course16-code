package ro.fasttrackit.course16.homework.exceptions;

public class PersonValidationException extends RuntimeException {
    public PersonValidationException(String message) {
        super(message);
    }
}
