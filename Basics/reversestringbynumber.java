import java.util.Scanner;
public class reversestringbynum
{
    public static void main(String[] args)
    {
        int x;
        int rev=0;
        int rem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be reversed:");
        String str=sc.nextLine();
        x=Integer.parseInt(str);
        while(x>0)
        {
            rem=x%10;
            x=x/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    } 
}
