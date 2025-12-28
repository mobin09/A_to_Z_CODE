import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
          String str1 = "Abc";// SCP
          String str2 = new String("Xyz");// SCP, Heap

          Integer[] arr  = {10,20,30,40};
          
         long l= Arrays.stream(arr).sorted((x,y) -> - x.compareTo(y)).skip(1).findFirst().get();
         System.out.println(l);

        //  String str3 = "ilovecoding";
        
        //  Character[] ch = str3.toCharArray();

        //  Map<String, Long> map = Arrays.stream(ch).collect(Collectors.groupingBy(
        //     Function.identity(),
        //     Collectors.counting()
        //  ));

        //  System.out.println(map);
   
       

          //(Xyz)


    }
}


@FunctionalInterface
interface Interf{
    public String toString();

    default void say(){
       

    }

    public static void main(){
        
    }
}

class Test {
   int x;
   Test t1;
   private  Test(int y){
       this.x = y;
    }
   
   public Test createObje(int z){
    if(this.x == z && t1 != null){
              t1 = this;
    }else{
        t1 = new Test(z);
    }

    return t1;

   }
     
 


}



