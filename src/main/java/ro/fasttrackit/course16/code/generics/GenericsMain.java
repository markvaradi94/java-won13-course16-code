package ro.fasttrackit.course16.code.generics;

import ro.fasttrackit.course16.homework.Person;

import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        List<String> names = List.of("Gheorghe");
        names.get(0).toUpperCase();

        OldBox oldBoxWithNumber = new OldBox(2);
        OldBox oldBoxWithString = new OldBox("Alex");

        if (oldBoxWithNumber.getItem() instanceof Integer) {
            System.out.println(((int) oldBoxWithNumber.getItem()) + 5);
        }

        Box<Integer> boxWithInteger = new Box<>(5);
        Integer item1 = boxWithInteger.getItem();

        Box<String> boxWithString = new Box<>("Gyuri");
        String item2 = boxWithString.getItem();

        Pair<Double, Long> pair = new Pair<>(2.5, 2L);

        System.out.println(max("abc", "xyz"));
        System.out.println(max(15, 45));
        System.out.println(max(Person.builder()
                        .name("personA")
                        .age(20)
                        .build(),
                Person.builder()
                        .name("personB")
                        .age(10)
                        .build()));
    }

    public static <A extends Comparable<A>> A max(A first, A second) {
        return first.compareTo(second) > 0 ? first : second;
    }

    private static void handleBoxItem(OldBox oldBox) {
        Object item = oldBox.getItem();
        if (item instanceof Integer intItem) {
            System.out.println(intItem + 5);
        } else if (item instanceof String stringItem) {
            System.out.println("Received a string of value " + stringItem);
        }
    }
}
