public class RecursiveFib {

    // F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2)
    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
