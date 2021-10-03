import java.util.Scanner;
 public class rectanglesquare{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length:");
        int x=sc.nextInt();
        
        System.out.println("Enter Breath:");
        int y=sc.nextInt();
        
        if(x==y)
        {
        System.out.println("Square");
        }
        else
        {
            System.out.println("Rectangle");
        }
    }
}