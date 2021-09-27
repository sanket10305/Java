import java.util.Scanner;
public class ForLoopDemo{
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        
        //ForLoop
        /*for(int i=1;i<=10;i++){ 
            System.out.println(num+"x"+i+"="+num*i);}*/
            
            int i=1;
            
            //WhileLoop
          /* while(i<=10){
                System.out.println(num +"x"+i+"="+num*i);
                i++;
                
            }*/
            do{
                System.out.println(num +"x"+ i + "=" + num*i);
                i++;
            }
            while(i<=10);
    }
}