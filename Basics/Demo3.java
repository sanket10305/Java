public class Demo3 {
    static int x=50;
    int y=60;
    void add(){
        x=x+10;
        y=y+10;
    }
   
   public static void main(String[] args){
        Demo3 obj=new Demo3();
        System.out.println("X="+x+"\tY="+obj.y);
        obj.add();
        System.out.println("X="+x+"\ty="+obj.y);
        
   
       
   }
    
}