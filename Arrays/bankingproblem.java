import java.util.Scanner;
public class bankingproblem
{
 public static void main(String[]args)
 {
     int choice=0;
     
     Scanner sc=new Scanner(System.in);
     System.out.println("***Account Information System***");
     while(choice!=3)
     System.out.println("Select one option below");
     System.out.println("     1) Add record to file.");
     System.out.println("     2) Show record from file.");
     System.out.println("     3) Quit.");
     System.out.println("Enter your choice:");
     choice=sc.nextInt();
     switch(choice)
     {
       case 1:
       {

       }
     }
     sc.close();
 }   
}
