import java.util.*;
public class frequency
{
    public static void main(String[]args)
    {
        int counter=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [] arr=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            if(x==arr[i])
            {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}