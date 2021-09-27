import java.util.Scanner;
public class fibonacciseries
{
 public static void main(String[]args)
 {
     int n;
     int x=0;
     int y=1;
     int z;

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter how many number of terms you want to print of Fibonacci series(AT least two):");
     n=sc.nextInt();

     if(n>=2)
     {
     System.out.println(x);
     System.out.println(y);
     
     for(int i=2;i<n;i++)
     {
         z=x+y;
         System.out.println(z);
         x=y;
         y=z;
     }
    }
     else 
     {
         System.out.println("Sorry wrong input.");
     }
 }    
}
