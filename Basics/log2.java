import java.util.Scanner;
public class log2
{
 public static void main(String[]args)
 {
     double sum=0.0;
     double sign=1.0;
     Scanner sc=new Scanner(System.in); 
     System.out.println("Enter the no of terms you want to print: ");
     double n=sc.nextDouble();
     for(double i=1.0;i<=n;i=i+1.0)
     {
         double b=1/i;
         sum=sum+(b*sign);
         sign=sign*(-1);
     }
     System.out.println("The sum is: "+sum);
 }    
}
