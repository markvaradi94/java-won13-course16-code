package ro.fasttrackit.course16.code.recursions;

public class FirstRecursion {
    private static long counter = 0;

    public static void main(String[] args) {
        infiniteLoop();
        printNumbers(5);
    }

    public static void infiniteLoop() {
        if (counter == 100) {
            return;
        }

        counter++;
        infiniteLoop();
    }

    // direct recursion
    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println(n);
        printNumbers(n - 1);
    }

    // indirect recursion
    public static void printIndirectly(int n) {
        if (n <= 0) {
            return;
        }

        System.out.println(n);
        indirectMethodCall(n - 1);
    }

    public static void indirectMethodCall(int n) {
        printIndirectly(n);
    }
}
