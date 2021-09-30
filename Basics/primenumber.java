import java.util.Scanner;
public class primenumber
{
    public static void main(String[]args)
    {
        int c=0;
        int num;
        int rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check prime or not:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            rem=num%i;
            if(rem==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("The number is a prime number");
        }
        else
        {
            System.out.println("The number is not prime");
        }
    }
}