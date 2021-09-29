import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class job
{
    public static void main(String[]args)
    {
        int age;
        char sex;
        char mar;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        age=sc.nextInt();
        System.out.println("Enter your sex:[M/F]");
        sex=sc.next().charAt(0);
        System.out.println("Enter your marital status:[Y/N]");
        mar=sc.next().charAt(0);
        if(sex=='M')
        {
            if((age>=20)&&(age<=40))// boys
            {
            System.out.println("You may work anywhere");
            }
            else if((age>40)&&(age<60))//boys+girls
            {
                System.out.println("You may only work in urban areas.");
            }
            else
            {
                System.out.println("Incorrect input");   
            }
        }
        else if(sex=='F')
        {
            System.out.println("You may only work in urban areas.");
        }
        sc.close();
    } 
}
