public class Calculator {

    static long calculateSquares(int n) {
        long sum = 0;
        long squared = 0;
        long result = 0;

        final int N = n;

        sum = N * (N + 1) / 2;
        squared = (N * (N + 1) * (2 * N + 1)) / 6;

        result = sum * sum - squared;
        return result;
    }
}
