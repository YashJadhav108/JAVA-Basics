import java.util.*;

class Switch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.printf("To find area of Rectangle input 'a' \n" +"To find area of Trapezium input 'b'\n");
        char choice = sc.next().charAt(0);

        if(choice != 'a' && choice != 'b')
        {
            System.out.println("Enter valid input");
        }
           
        else{
            switch(choice)
            {
                case 'a':
                        System.out.println("Please enter dimensions of Rectangle:-");
                        int l = sc.nextInt();
                        int b = sc.nextInt();
                        System.out.println("The area of rectangle is "+ (l*b));
                        break;
                case 'b':
                        System.out.println("Please enter dimensions of Trapezium:-");
                        System.out.println("Length of first parallel side:-");
                        int l1= sc.nextInt();
                        System.out.println("Length of second parallel side:-");
                        int l2 = sc.nextInt();
                        System.out.println("height of Trapezium:-");
                        int h = sc.nextInt();

                        System.out.println("Area of Trapezium is "+ ((0.5*(l1+l2))*h));
                        break;
            }
        }


    }

}