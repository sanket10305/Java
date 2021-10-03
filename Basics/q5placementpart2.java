import java.util.Scanner;
public class q5placementpart2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int min=0,max=0,middle=0,k=0;
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

        for(int i=1; i<=min; i++)
        {
            if(one%i==0 && two%i==0 && three%i==0)
            {
                k=i;
            }
        }
        System.out.println("The treasure is in the box which has number "+middle+"."+"\nThe code to open the box is "+ k+".");
        sc.close();
    }
