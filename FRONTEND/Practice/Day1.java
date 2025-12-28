import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Day1 {

   public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(3);
      list.add(7);

      int[] arr = {10,50,40,30};

      long l = list.stream().reduce((a,b) ->a+b).get();
      System.out.println("Sum of Nummber is:" + l);

     int x = Arrays.stream(arr).reduce((a, b)  -> a + b).getAsInt();
     System.out.println("Sum number::" + x);
   }

}