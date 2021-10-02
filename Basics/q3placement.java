import java.util.Scanner;
public class q3placement 
{
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   int birth=sc.nextInt();
   int current=sc.nextInt();
   if(current>birth)
   {
     System.out.println(current-birth);
   }
   else if(current<birth)
   {
       System.out.println((current+100)-birth);
   }
   else if(current==birth)
   {
         System.out.println("100");
   }    
   sc.close();
}
}     