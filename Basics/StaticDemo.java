public class StaticDemo {
    static{
        System.out.println("1");
        
    
    }
    {
        System.out.println(5);
    }
   
   public static void main(String[] args){
     System.out.println("2"); 
     new StaticDemo();
   }
   static{
        System.out.println("9");
        
    
    }static{
        System.out.println("8");
        
    
    }
    
}