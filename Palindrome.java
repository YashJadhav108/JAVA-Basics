import java.util.*;

public class Palindrome
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a palindrome: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) 
        {
            System.out.println(number + " is a palindrome.");
        } 
        else
        {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int n) {
        int a = n;
        int x = 0;

        while (n > 0) {
            int digit = n % 10;
            x = x * 10 + digit;
            n /= 10;
        }

        return a == x;
    }
}
