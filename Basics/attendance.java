import java.util.Scanner;
 public class attendance{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Have you any medical issues:[Y/N]");
    char a=sc.next().charAt(0);
    switch(a){
    case 'Y': 
        System.out.println("You are eligilbe for exam");
        break;
    case 'N':
        System.out.println("Number of clasess held:");
        int x=sc.nextInt();
        System.out.println("Number of classes attended:");
        int y=sc.nextInt();
        int z=(y*100)/x;
        System.out.println("Your attendance percentage is:"+z);
        if(z>=75)
        {
            System.out.println("You are eligible for exam");
        }
        else
        {
            System.out.println("You are not eligible for exam");
        }
        break;
    default: 
        System.out.println("Sorry! Wrong choice");

    }
    }
}