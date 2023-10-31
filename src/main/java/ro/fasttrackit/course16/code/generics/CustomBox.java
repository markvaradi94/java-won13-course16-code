package ro.fasttrackit.course16.code.generics;

import java.io.Serializable;

public class CustomBox<T extends PrintableContent & Serializable> {
    private final T item;

    public CustomBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printContent() {
        System.out.println(item.printAsContent());
    }
}
