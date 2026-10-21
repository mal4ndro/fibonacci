import java.util.Scanner;

public class RewardSystem {

    // one reward value per loyal year: 1, 1, 2, 3, 5, 8 ...
    public static long[] rewardPoints(int years) {
        long[] points = new long[years];
        points[0] = 1;
        if (years >= 2) {
            points[1] = 1;
        }
        for (int i = 2; i < years; i++) {
            points[i] = points[i - 1] + points[i - 2];
        }
        return points;
    }

    public static void run(Scanner input) {
        System.out.print("Enter number of years the customer has been loyal: ");

        if (!input.hasNextInt()) {
            input.next();
            System.out.println("Invalid input: please enter a whole number.");
            return;
        }
        int years = input.nextInt();

        if (years < 1) {
            System.out.println("Invalid input: years must be at least 1.");
            return;
        }
        if (years > 90) {
            System.out.println("Invalid input: years must be 90 or less.");
            return;
        }

        long[] points = rewardPoints(years);
        long total = 0;

        System.out.println();
        System.out.printf("%-6s%15s%n", "Year", "Reward Points");
        System.out.println("---------------------");
        for (int i = 0; i < points.length; i++) {
            System.out.printf("%-6d%15d%n", i + 1, points[i]);
            total = total + points[i];
        }
        System.out.println("---------------------");
        System.out.printf("%-6s%15d%n", "Total", total);
    }
}
