import java.util.Scanner;

public class uppercaselowercase
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the character to check: ");
        char a=sc.next().charAt(0);
        if(a>=65&&a<=90)
        {
            System.out.println("The alphabet is uppercase.");
        }
        else if(a>=97&&a<=122)
        {
            System.out.println("The alphabet is lowercase.");
        }
        else
        {
            System.out.println("incorrect Input");
        }
    }
    
}
