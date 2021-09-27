import java.util.Scanner;
public class factorial{
  public static void main(String[] args)
  {
      int fact=1;
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      num=sc.nextInt();
      for(int i=1;i<=num;i++)
      {
          fact*=i;
      }
      System.out.println(fact);
  }
}