import java.util.Scanner;
public class Factorial{
  public static void main(String[] args)
  {
      int x;
      int y;
      int a=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number:");
      x=sc.nextInt();
      System.out.println("Enter the exponential:");
      y=sc.nextInt();
      for(int i=1;i<=y;i++)
      {
         a*=x;
      }
      System.out.println(a);
  }
}