public class star5
{
    public static void main(String[]args)
     {
       for(int i=1;i<=5;i++)
       {
           for(int j=1;j<=5-i;j++)
           {
               System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
               System.out.print(i);
           }
           for(int l=i-1;l>=1;l--)
           {
               System.out.print(i);
           }
            System.out.println();
       }
      
     }        
}
