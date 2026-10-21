public class TabulationFib {

    // fills a table from the bottom up
    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }
        long[] table = new long[n + 1];
        table[1] = 1;
        for (int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[n];
    }

    // only keeps the last two values, so it uses no array
    public static long fibTwoVariables(int n) {
        if (n <= 1) {
            return n;
        }
        long a = 0;
        long b = 1;
        for (int i = 2; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}
