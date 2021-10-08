import java.util.Scanner;
public class sumofevenandodd
{
    public static void main(String[]args)
    {
        char info;
        int num;
        int rem;
        int even=0;
        int odd=0;
        Scanner sc=new Scanner(System.in);
        do
        {
        System.out.println("Do you want to add more set of integers:[Y/N]");
        info=sc.next().charAt(0);
        
        
            System.out.println("Enter the number:");
            num=sc.nextInt();
            rem=num%2;
            if(rem==0)
            {
                even+=num;
            }
            else
            {
                odd+=num;
            }
        
        }
        while(info =='Y');
        
            System.out.println("Sum of even numbers is:"+even);
            System.out.println("Sum of odd numbers is:"+odd);
        
        sc.close();      
        
    }
}