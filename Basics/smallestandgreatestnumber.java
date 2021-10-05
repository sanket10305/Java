import java.util.Scanner;
public class smallestandgreatestnumber
{
    public static void main(String[]args)
    {
       int num;
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       char choice;
       do
       {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       num=sc.nextInt();
       if(num>max)
       {
           max=num;
       }
       if(num<min)
       {
           min=num;
       }
       System.out.println("Do you want to continue:[Y/N]");
        choice=sc.next().charAt(0);
       }
       while(choice=='Y'||choice=='y');
       System.out.println("The largest number is:"+max);
       System.out.println("The smallest number is:"+min);
       
    }
}
    

