import java.util.List;

public class Day1 {
   private static void printListStructured(List<Integer> list){
      for(Integer n: list){
         System.out.println("The num is::" + n);
      }
   }
   public static void main(String[] args) {
      List<Integer> list = List.of(12,13,14,15,20);
      printListStructured(list);
   }
    
}