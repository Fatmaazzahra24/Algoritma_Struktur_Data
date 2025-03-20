public class FibonacciMain {
    public static void main(String[] args) {
        int n = 5; 
        System.out.println("Fibonacci ke-" + n + " (Brute Force): " + Fibonacci.fibonacciBF(n));

        int[] memo = new int[n + 1];
        System.out.println("Fibonacci ke-" + n + " (Divide & Conquer): " + Fibonacci.fibonacciDC(n, memo));
    }
}
    

