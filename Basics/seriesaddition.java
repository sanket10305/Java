import java.util.Scanner;
public class seriesaddition
{
    public static void main(String[]args)
    {
        double no;
        double sum=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many terms you want to print:");
        no=sc.nextInt();
        for(double i=1.0;i<=no;i=i+1.0)
        {
            double k=1/i;
           sum=sum+k;
        }
        System.out.println("The sum is : "+sum);
    sc.close();
    }
}
