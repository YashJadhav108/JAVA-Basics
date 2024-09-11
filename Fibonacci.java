import java.util.*;
public class Fibonacci {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number to print the Fibonacci number at that position");
        int n = sc.nextInt();
        
        System.out.println("Fibonacci number at position " + n + " using recursion: " + fibonacciRecursive(n));
        System.out.println("Fibonacci number at position " + n + " using iteration: " + fibonacciIterative(n));
    }
}
