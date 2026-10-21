import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println();
            System.out.println("1. Compare fibonacci methods");
            System.out.println("2. Reward system");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            if (!input.hasNextInt()) {
                input.next();
                System.out.println("Please enter a number.");
                continue;
            }
            choice = input.nextInt();

            if (choice == 1) {
                compareMethods(30);
            } else if (choice == 2) {
                RewardSystem.run(input);
            } else if (choice != 3) {
                System.out.println("Invalid choice.");
            }
        }
    }

    public static void compareMethods(int n) {
        System.out.println("Fibonacci of " + n);

        long start = System.nanoTime();
        long result = RecursiveFib.fib(n);
        printTime("Recursive", result, start);

        start = System.nanoTime();
        long[] series = IterativeFib.fibSeries(n);
        printTime("Iterative", series[n], start);

        start = System.nanoTime();
        result = MemoFib.fib(n);
        printTime("Memoization", result, start);

        start = System.nanoTime();
        result = TabulationFib.fib(n);
        printTime("Tabulation", result, start);

        start = System.nanoTime();
        result = TabulationFib.fibTwoVariables(n);
        printTime("Two variables", result, start);
    }

    public static void printTime(String name, long result, long start) {
        long end = System.nanoTime();
        double ms = (end - start) / 1000000.0;
        System.out.printf("%-15s result = %d, time = %.4f ms%n", name, result, ms);
    }
}
