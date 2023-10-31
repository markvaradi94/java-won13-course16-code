package ro.fasttrackit.course16.code.optional;

import java.util.List;
import java.util.Optional;

public class OptionalsMain {
    public static void main(String[] args) {
//        List<Integer> results = getResults();
//        Integer firstElement = results.get(0);
//        firstElement.doubleValue();

//        Integer max = getMax(List.of());
//        max.doubleValue();

        Optional<Integer> maxOptional = getMaxOptional(List.of());

        if (maxOptional.isPresent()) {
            Integer max = maxOptional.get();
            System.out.println(max.doubleValue());
        }

        Integer max2 = getMaxOptional(List.of())
                .orElse(null);

        if (max2 == null) {
            System.out.println("No value found");
        }

//        doSomething(null);
        doSomethingBetter(null);
    }

    public static void doSomethingBetter(Integer value) {
//        Integer i = Optional.ofNullable(value)
//                .orElse(-1);

        Integer i = Optional.ofNullable(value)
                .orElseThrow();

        System.out.println(i);
    }

    public static void doSomething(Optional<Integer> integerOptional) {
        if (integerOptional.isPresent()) {
            // ceva
        } else {
            // altceva
        }
    }

    public static Optional<Integer> getMaxOptional(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return Optional.empty();
        }

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return Optional.of(max);
    }

    public static Integer getMax(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }

    private static List<Integer> getResults() {
        return List.of(null);
    }
}
