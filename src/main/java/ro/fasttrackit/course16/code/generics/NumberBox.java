package ro.fasttrackit.course16.code.generics;

public class NumberBox<T extends Number> {
    private final T item;

    public NumberBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printContent() {
        System.out.println(item.doubleValue());
    }
}
