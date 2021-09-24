public class armstrongnumber 
{
 public  static void main(String[]args)
 {
     int x,y,z,a,b,c;
     for(int num=1;num<=500;num++)
     {
         x=num%10;
         a=num/10;
         
         y=a%10;
         b=a/10;

         z=b%10;
         c=b/10;
         if(num==(x*x*x)+(y*y*y)+(z*z*z))
         {
             System.out.println(num);
         }
     }
 }   
}
