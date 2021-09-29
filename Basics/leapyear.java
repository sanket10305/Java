
import java.util.Scanner;
public class leapyear
{
    public static void main(String[]args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to check leap year:");
        num=sc.nextInt();
        if(num%100==0)
        {
            if(num%400==0)
            {
                System.out.println("It is a leap year and a century year");
            }   
            else
            {
            System.out.println("It not a  leap year but a century year");    
            }
        }
        else
        {
            if(num%4==0)
            {
                System.out.println("It is a leap year");
            } 
            else
            {
            System.out.println("It is not a leap year");
            }
        }    
    } 
}