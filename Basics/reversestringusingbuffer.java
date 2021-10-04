import java.util.Scanner;
public class reversestringusingbuffer
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to reverse:");
        String str=sc.nextLine();
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
    } 
}