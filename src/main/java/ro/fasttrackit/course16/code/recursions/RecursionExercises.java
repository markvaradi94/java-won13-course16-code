package ro.fasttrackit.course16.code.recursions;

import java.util.HashMap;
import java.util.Map;

public class RecursionExercises {
    public static Map<Long, Long> fibonacciResults = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(sumFromOneToN(5));
        System.out.println("===================================");

        long start = System.currentTimeMillis();
        System.out.println(fibonacci(10));
        System.out.println(System.currentTimeMillis() - start);
    }

    public static long sumFromOneToN(int n) {
        if (n == 1) {
            return 1;
        }

        return n + sumFromOneToN(n - 1);
    }

    public static long fibonacci(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (fibonacciResults.containsKey(n)) {
            return fibonacciResults.get(n);
        }

        long result = fibonacci(n - 1) + fibonacci(n - 2);
        fibonacciResults.put(n, result);

        return result;
    }
}
