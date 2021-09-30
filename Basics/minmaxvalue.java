import java.util.Scanner;
public class minmaxvalue
{
    public static void main(String[]args)
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int num;
        char choice;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter the number:");
            num=sc.nextInt();
            if(num>max)
            {
                max=num;
            }
            else if(num<min)
            {
                min=num;
            }
            System.out.println("Do you want to continue:[Y/N]");
            choice=sc.next().charAt(0);   
        } 
        while(choice=='Y'); 
        System.out.println("The largest number is:"+max);
        System.out.println("The smallest number is:"+min);
    }
} 