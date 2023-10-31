package ro.fasttrackit.course16.code.generics;

public interface PrintableContent {
    default String printAsContent() {
        return "Content from printable interface";
    }
}
