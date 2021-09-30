import java.util.Scanner;
public class numberofapples
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0, x=0;
        do
        {
            x++;
            a+=x*12;
        }
        while(num>=a);
        System.out.println(x*8);
    }
}
    
}
