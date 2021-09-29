import java.util.Scanner;

public class IfElseDemo{
    
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the first number");
        int a =sc.nextInt();
        
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        
         int c=a+b;
        if  (c>90){
            System.out.println("greater value");
        } 
        else if (c==90){
            System.out.println("Similar Value");
        } 
        else{
            System.out.println("smaller value");
        }
            
            
        }
}