import java.util.Scanner;
public class SwitchDemo{ 
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number");
        int num= sc.nextInt();
        switch(num) {
            case 1:{
                System.out.println("First");
                break;
            }
            case 2:{
                System.out.println("Second");
                break;
            }
            case 3:{
                System.out.println("Third");
                break;
            }
            default:{
                System.out.println("Default");
            }
        }
    }
}