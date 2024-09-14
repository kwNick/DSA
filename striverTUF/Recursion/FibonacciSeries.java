public class FibonacciSeries {
    static void fib(int n) { // swap and print method; O(n) time
        if (n == 0) {
            System.out.println("The Fibonacci Series up to " + n + "th term:");
            System.out.print(0);
        } else {
            int secondLast = 0;
            int last = 1;
            System.out.println("The Fibonacci Series up to " + n + "th term:");
            System.out.print(secondLast + " " + last + " ");
            int cur;
            for (int i = 2; i <= n; i++) {
                cur = last + secondLast;
                secondLast = last;
                last = cur;
                System.out.print(cur + " ");
            }
        }
    }

    static int rec_fib(int N) { // recursive way; O(2^n) time
        // Base Condition.
        if (N <= 1) {

            return N;
        }

        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = rec_fib(N - 1);
        int slast = rec_fib(N - 2);

        return last + slast;
    }

    public int fib_Math(int n) { // using Maths(Golden Ratio); O(logN) time
        return (int) Math.round(Math.pow(1.6180339887, n) / Math.sqrt(5));
    }

    public static void main(String[] args) {
        fib(5);
        rec_fib(5);
    }
}