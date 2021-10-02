import java.util.Scanner;
public class q2placementpart2 
{
 public static void main(String[]args)
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the character to check:");
     char a=sc.next().charAt(0);
     if(a==65&&a==97)
     {
         System.out.println("It is a vowel.");
     }
     else if(a==69||a==101)
     {
        System.out.println("It is a vowel.");
     }
     else if(a==73||a==105)
     {
        System.out.println("It is a vowel.");
     }
     else if(a==79||a==111)
     {
        System.out.println("It is a vowel.");
     }
     else if(a==85||a==117)
     {
        System.out.println("It is a vowel.");
     }
     else
     {
        System.out.println("It is a consonent."); 
     }
     sc.close();
 }   
}