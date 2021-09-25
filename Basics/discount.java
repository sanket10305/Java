import java.util.Scanner;
 public class discount{
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("no of quantitiies:");
    int x =sc.nextInt();
  
    if(x*100>1000)
    {
        System.out.println("You get a total discount of: "+(.1*x*100)+" And your total amount is: "+(x*100-(.1*100*x)));
    }
  
    else
    {
        System.out.println("No discount and your total price is: "+x*100);
    }
    sc.close();

    }
 }