import java.util.Scanner;
public class absolutevalue{
  public static void main(String[] args)
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number");
    int x = s.nextInt();
    if(x<0)
{
      System.out.println("Absolute value : "+(-1*x));
    }
    else
{
      System.out.println("Absolute value : "+x);
    }
    sc.close();
  }
}