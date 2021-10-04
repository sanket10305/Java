import java.util.Scanner;
public class sinx
{
 public static void main(String[]args)
 {
  int a=1;
  int b=1;
  int sign=1;
  double sum=0.0;
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int n=sc.nextInt();
  for(int i=1;i<=n;i++)
  {
      for(int j=1;j<=a;j++)
      {
          b*=j;
      }
   sum+=((Math.pow(x, a))/b)*sign;
   sign*=-1;
   a=a+2;
  }
  System.out.println(sum);
   sc.close();
}   
}
