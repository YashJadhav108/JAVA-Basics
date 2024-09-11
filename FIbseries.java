//WAP to print Fibonacci Series in Java
import java.util.*;

class Fibseries
{

    public static void main(String[] args) 
    {
        System.out.println("Enter a number to print fibonacci series till that position:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Fibonacci Series up to " + n + " terms:");

        printFibonacci(n);
    }

    public static void printFibonacci(int n) 
    {
        int a = 0, b = 1, c;

        
        if (n >= 1) 
        {
            System.out.print(a + " ");
        }
        
        if (n >= 2) 
        {
            System.out.print(b + " ");
        }

        for (int i = 3; i <= n; i++)
        {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
