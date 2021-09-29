import java.util.Scanner;
public class inttwonumbers
{
    public static void main(String[]args)
    {
        int x;
        int y;
        int sum=0;
        char a;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Do you want to continue:[Y/N]");
            a=sc.next().charAt(0);
            System.out.println("Enter the first number:");
            x=sc.nextInt();
            System.out.println("Enter the second number:");
            y=sc.nextInt();
            sum=x+y;
            System.out.println("Sum of two numbers is:"+sum);
            
        }
        while(a=='Y');
    }
}