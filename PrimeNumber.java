import java.util.*;

public class PrimeNumber
{
    public static void prime(int n)
    {
        boolean isPrime = true;

            if (n <= 1) 
            {
                isPrime = false;
            } 
            else 
            {
                for (int i = 2; i < (n/2); i++)
                {
                    if (n % i == 0) 
                    {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) 
            {
                System.out.println(n + " is a prime number.");
            } 
            
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a range to find all the prime numbers between them:-");
        System.out.println("Enter the first number:-");
        int a = sc.nextInt();
        System.out.println("Enter till which number prime numbers should be printed:-");
        int b = sc.nextInt();

            if(a>b)
            {
                System.out.println("Invalid Range");
            }

            else
            {
                for(int i=a;i<=b;i++)
                {
                    prime(i);
                }
            }

        
    }
}
