//Using third variable
/*public class swapnumbers
{
    public static void main(String[]args)
    {
        int a=10;
        int b=20;
        int temp=0;
        System.out.println("Before swapping a:"+a+"\tb:"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a:"+a+"\tb:"+b);
    }
}*/
public class swapnumbers
{
    public static void main(String[]args)
    {
        int a=10;
        int b=60;
        System.out.println("Before swapping a:"+a+"\tb:"+b);
        b=b+a;
        a=b-a;
        b=b-a;
        System.out.println("After swapping a:"+a+"\tb:"+b);
    }
}