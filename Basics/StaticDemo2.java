public class StaticDemo2 {
    static{
        System.out.println("static-1");
    }
    {
        System.out.println("init-1");
    }
    {
        System.out.println("init-2");
    }
   
   public static void main(String[] args){
     System.out.println("main-1"); 
      StaticDemo2 obj=new StaticDemo2();
      StaticDemo2 obj1=new StaticDemo2();
      StaticDemo2 obj2=new StaticDemo2();
   }
       static{
        System.out.println("static-2");
    }    static{
        System.out.println("static-3");
    }
    
}
