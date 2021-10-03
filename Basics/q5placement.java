import java.util.Scanner;
public class q5placement
{
    public static void main(String[]args)
    {
        int divisor,divident;
        int rem=0,hcf=0;
        int min=0,max=0,middle=0;
        Scanner sc=new Scanner(System.in);
        int one=sc.nextInt();
        int two=sc.nextInt();
        int three=sc.nextInt();
        if(one>two)
        {
            min=two;
            max=one;
        }
        if(two>one)
        {
            min=one;
            max=two;
        }
        if(three>min)
        {
         if(three>max)
         {
             middle=max;
             max=three;
         }
         if(three<max)
         {
             middle=three;
         }   
        }
        if(three<min)
        {
           middle=min;
           min=three;
        }   
        do
        {
           divisor=min;
           divident=max;
           rem=divident%divisor; 
           if(rem==0)
           {
               hcf=divisor;
           }
           else
           {
               divident=divisor;
               divisor=rem;
           }
        }
        while(rem>0);
        do
        {
            divisor=hcf;
            divident=middle;
            rem=divident%divisor;
            if(rem==0)
            {
                hcf=divisor;
            }
            else
            {
              divident=divisor;
              divisor=rem;
            }
        }
        while(rem>0);
        System.out.println("The treasure is in the box which has number "+middle+"."+"The code to open the box is "+ hcf+".");
        sc.close();
    }
}
