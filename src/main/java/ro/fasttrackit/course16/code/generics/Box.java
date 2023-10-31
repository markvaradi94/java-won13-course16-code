package ro.fasttrackit.course16.code.generics;

public class Box<T> {
    private final T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printContent() {
        System.out.println(item.toString());
    }
}
