public class Fibonacci {


    public static int fibonacciBF(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciBF(n - 1) + fibonacciBF(n - 2);
    }
    public static int fibonacciDC(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = fibonacciDC(n - 1, memo) + fibonacciDC(n - 2, memo);
        return memo[n];
    }
}
