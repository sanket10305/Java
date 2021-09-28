/*import java.util.Scanner;
public class hcf
{
    public static void main(String[]args)
    {
        int divisor;
        int dividend;
        int rem=0;
        int hcf=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        divisor=sc.nextInt();
        System.out.println("Enter the second number:");
        dividend=sc.nextInt();
        do
        {
            rem=dividend%divisor;
            if(rem==0)
            {
                hcf=divisor;
            }
            else
            {
                dividend=divisor;
                divisor=rem;
            }
        }
        while(rem>0);
        System.out.println("HCF of the given numbers is:"+hcf);
    }
}*/
import java.util.Scanner;
public class hcf
{
   public static void main(String args[])
   {
      int a, b, hcf = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number");
      a = sc.nextInt();
      System.out.println("Enter second number");
      b = sc.nextInt();
      for(int i = 1; i <= a || i <= b; i++) 
      {
         if(a%i == 0 && b%i == 0)
         hcf = i;
      }
      System.out.println("HCF of given two numbers is: "+hcf);
   }
}