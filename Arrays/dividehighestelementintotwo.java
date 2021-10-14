import java.util.*;
public class dividehighestelementintotwo 
{
 public static void main(String[] args) 
 {
    int lupin=0;
    int difference; 
    int max=Integer.MIN_VALUE;
    int secmax=Integer.MIN_VALUE;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of inputs: ");
    int num=sc.nextInt();
    int [] arr=new int[num];
    int [] arrnew=new int[num+1];
    System.out.println("Enter the elements: ");
    for(int i=0;i<num;i++)
    {
        arr[i]=sc.nextInt();
    } 
    for(int j=0;j<arr.length;j++)
    {
        if(arr[j]>max)
        {
            max=arr[j];
        }
    }
    for(int k=0;k<arr.length;k++)
    {
      if(arr[k]<max&&arr[k]>secmax)
      {
          secmax=arr[k];
      }
    }
    for(int l=0;l<arr.length;l++)
    {
        if(arr[l]==max)
        {
          lupin=l;
        }
    }
    difference=max-secmax;
    for(int m=0;m<lupin;m++)
    {
      arrnew[m]=arr[m];
    }
    arrnew[lupin]=secmax;
    arrnew[lupin+1]=difference;
    for(int n=lupin+1;n<arr.length;n++)
    {
        arrnew[n+1]=arr[n];
    }
    System.out.println("New Array: "+Arrays.toString(arrnew));
    sc.close();
 }
}