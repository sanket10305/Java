import java.util.Scanner;
public class guessmynumber
{
    public static void main(String[]args)
    {
     int num,guess;
     int tries=0;
     num=(int) ((Math.random()*100)+1);
     Scanner sc=new Scanner(System.in);
     do
     {
       System.out.println("Enter the number to guess:");
       guess=sc.nextInt();
       tries++;
       if(guess>num)
       {
           System.out.println("Too high, try again.");
       }
       else if(guess<num)
       {
           System.out.println("Too low, try again.");
       }
       else
       {
        System.out.println("Congrats you have got correct number in "+tries+" tries");
        break;
       }
     }
     while(true);
     sc.close();   
    }
}