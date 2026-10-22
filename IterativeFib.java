public class IterativeFib {

    // builds the whole series from the bottom up
    public static long[] fibSeries(int n) {
        long[] series = new long[n + 1];
        if (n >= 0) {
            series[0] = 0;
        }
        if (n >= 1) {
            series[1] = 1;
        }
        for (int i = 2; i <= n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series;
    }
}
