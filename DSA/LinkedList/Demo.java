import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
     public static void main(String[] args) {
     //      ArrayList<String> list = new ArrayList<>();
     //      list.add("one");
     //      list.add("two");
     //      list.add("three");
 
     //      Iterator<String> iterator = list.iterator();
     //      while (iterator.hasNext()) {
     //         String value = iterator.next();
     //           if (value.equals("two")) {
	//                 list.remove(value);  
     //            }
     //     }

     //     System.out.println(list);
     Test t1 = new Test(5).getTest(5);
     Test t2 = new Test(5).getTest(5);
     Test t3 = new Test(5).getTest(5);
     Test t5 = new Test(5).getTest(5);
     Test t6 = new Test(5).getTest(5);
     System.out.println(t1.hashCode());
     System.out.println(t2.hashCode());
     System.out.println(t3.hashCode());
     System.out.println(t5.hashCode());
     System.out.println(t6.hashCode());
     //System.out.println(t5.count);

     }
}





class Test {
    private  int x;
     static int count = 0;
     private static Test t;
     public Test(int x){
        this.x = x;
     }

    public  Test getTest(int Y){
           //System.out.println(this.x == Y);
          //  if(this.x == Y && count >= 2){
          //      t = this;
          //      System.out.println("Hello ---");
          //  }else{
          //      t = new Test(Y);
          //  }
          //  count++;
          //  return t;
          count++;
          if(count <= 2){
               t = new Test(Y);
          }
         
         
          return t;

    }


}












