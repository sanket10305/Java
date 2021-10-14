import java.util.*;
public class excludingseven 
{
    public static void main(String[] args) 
    {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int [] arr=new int[num+1];
     int j=1; int i=0;
     while(i<num+1)
     {
          if(j>=1&&j<10)
          {
           if(j==7)
           {
               j++;
           }
           else
           {
            arr[i]=j;
            j++;
            i++;
           }
          }
          else if(j>=10&&j<100)
          {
           if(j%7==0 || j%10==7 || ((j/10)%10)==7)
           {
               j++;
           }
           else
           {
               arr[i]=j;
               j++;
               i++;
           }
          }
          else
          {
            if(j%7==0||j%10==7||((j/10)%10)==7||(((j/10)/10)%10)==7)
            {
                j++;
            }
            else
            {
                arr[i]=j;
                j++;
                i++;
            }
          }
     }

     System.out.println(arr[num]);
     sc.close();
    }
}
