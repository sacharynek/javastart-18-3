public class Main {

    public static void main(String[] args) {
        long sum = 0;
        long squared = 0;
        long result = 0;

        final int N = 100;

        sum = N * (N+1)/ 2;
        squared = (N * (N + 1) * (2 * N + 1)) / 6;

        result = sum * sum - squared;
        System.out.println(result);
    }
}
