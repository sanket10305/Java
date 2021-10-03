
public class ReverseNumberDemo{
    public static void main (String[]args)
    {
        int num=12345;
        System.out.println("Input number:"+num);
        int rem=0;
        int p=0;
        while(num>0)
        {
            rem=num%10;
            num=num/10;
            p=p*10+rem;
        }
        System.out.println("Reversed number:"+p);
        
     
            
        }
        
    }