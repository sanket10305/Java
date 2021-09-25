public class Demo4 {
    static int x=50;
    int y=60;
    void add(){
        x=x+10;
        y=y+10;
    }
   
   public static void main(String[] args){
        Demo4 obj=new Demo4();
        System.out.println("X="+x+"\tY="+obj.y);
        obj.add();
        System.out.println("X="+x+"\ty="+obj.y);
        System.out.println("X="+x+"\tY="+obj.y);
        obj.add();
        System.out.println("X="+x+"\ty="+obj.y);
        System.out.println("X="+x+"\tY="+obj.y);
        obj.add();
        System.out.println("X="+x+"\ty="+obj.y);
         Demo4 obj1=new Demo4();
         obj1.add();
        System.out.println("X="+x+"\ty="+obj1.y);
   Demo4 obj2=new Demo4();
         obj2.add();
        System.out.println("X="+x+"\ty="+obj2.y);
       
   }
    
}
