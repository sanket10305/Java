import java.util.Scanner;
public class cosx    
    {
     public static void main(String[]args)
     {
      int a=2;
      int b=1;
      int sign=-1;
      double sum=1.0;
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int n=sc.nextInt();
      if(n>1)
      {
      for(int i=2;i<=n;i++)
      {
       for(int j=1;j<=a;j++)
       {
        b*=j;
       }   
        sum+=((Math.pow(x,a))/b)*sign;
        sign*=-1;
        a+=2;
      }
      System.out.println(sum);
      }
      if(n==1)
      {
        System.out.println("1"); 
      }
      sc.close();
     }   
    }
    

