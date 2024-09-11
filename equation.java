import java.util.*;

class equation
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Find the roots of an Quadratic equation");

        System.out.println("Enter the coefficient of 'x^2':-");
        double a = sc.nextDouble();

        System.out.println("Enter the coefficient of 'x':-");
        double b = sc.nextDouble();

        System.out.println("Enter the constant:-");
        double c = sc.nextDouble();

        double disc = ((b*b)-(4*a*c));

        if (disc<0)
        {
            System.out.println("The equation has no real roots");

        }
        else
        {
            double sqrtdisc = Math.sqrt(disc);
            double x1 = (-b + sqrtdisc)/(2*a);
            double x2 = (-b - sqrtdisc)/(2*a);

            System.out.println("The roots of the equation are:-");
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}