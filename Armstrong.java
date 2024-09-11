import java.util.Scanner;

public class Armstrong
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originNum, remainder, result = 0, n = 0;

        originNum = num;

        for (;originNum != 0; originNum /= 10, ++n);

        originNum = num;

        for (;originNum != 0; originNum /= 10) {
            remainder = originNum % 10;
            result += Math.pow(remainder, n);
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
