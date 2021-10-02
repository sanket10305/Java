import java.util.Scanner;
public class q1placement
{
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   int row=sc.nextInt();
   int column=sc.nextInt();
   int num=sc.nextInt();
   if(num>=column+1&&num<=2*column)
   {
       System.out.println("It is an orange tree");
   }
   else if(num>=(column*(row-2))+1&&num<=(column*(row-1)))
   {
    System.out.println("It is an orange tree");   
   }
   else
   {
    System.out.println("It is  not an orange tree");
   }
   sc.close();
 }   
}
