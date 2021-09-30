import java.util.Scanner;
public class positivenegetivecount
{
    public static void main(String[]args)
    {
        int num;
        int pos=0;
        int neg=0;
        int zero=0;
        char choice;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter the number:");
            num=sc.nextInt();
            if(num>0)
            {
                pos++;
            }
            else if(num<0)
            {
                neg++;
            }
            else
            {
                zero++;
            }
            System.out.println("Do you wish to continue:[Y/N]");
            choice=sc.next().charAt(0);
        }
        while(choice=='Y');
        System.out.println("Positive Count is:"+pos);
        System.out.println("Negetive count is:"+neg);
        System.out.println("Zero count is:"+zero);
        sc.close();
    }      
}