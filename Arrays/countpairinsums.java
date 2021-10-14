import java.util.*;
public class countpairinsums 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int k=num;
        int counter=0;
        int sum=sc.nextInt();
        int [] arr=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if(sum==arr[i]+arr[j])
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        sc.close();
    }
}