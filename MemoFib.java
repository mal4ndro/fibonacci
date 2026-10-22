public class MemoFib {

    public static long fib(int n) {
        long[] memo = new long[n + 1];
        return fibMemo(n, memo);
    }

    // memo[i] stays 0 until F(i) is worked out
    private static long fibMemo(int n, long[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        return memo[n];
    }
}
