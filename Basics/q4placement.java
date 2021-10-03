import java.util.Scanner;
public class q4placement
{
  public static void main(String[]args)
  {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      int z=sc.nextInt();
      String a=sc.next();
      if(a.equals("L1"))
      {
       if(y>z)
       {
           System.out.println("L3");
       }
       else if(z>y)
       {
          System.out.println("L2");
       }
       else
       {
           System.out.println("Remaining both labs have same capacity.");
       }   
      }
      if(a.equals("L2"))
      {
       if(x>z)
       {
           System.out.println("L3");
       }
       else if(z>x)
       {
          System.out.println("L1");
       }
       else
       {
           System.out.println("Remaining both labs have same capacity.");
       }   
      }
      if(a.equals("L3"))
      {
       if(y>x)
       {
           System.out.println("L1");
       }
       else if(x>y)
       {
          System.out.println("L2");
       }
       else
       {
           System.out.println("Remaining both labs have same capacity.");
       }   
      }
      sc.close();
  }  
}

