import java.util.Scanner;
 public class greatestnumber{
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first Number:");
    int x =sc.nextInt();
    System.out.println("Enter the second Number:");
    int y =sc.nextInt();
    if(x>y)
    {
        System.out.println(x);
    }
    else if(x==y)
    {
        System.out.println("Same");
    }
    else
    {
        System.out.println(y);
    }
    }
 }