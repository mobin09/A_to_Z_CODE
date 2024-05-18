import java.util.Arrays;
import java.util.stream.*;
public class Arr8 {
   static int[][] arr = {{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}};
   public static void main(String[] args) {
       IntStream stream =  Arrays.stream(arr).flatMapToInt(a -> Arrays.stream(a));
       long count =   stream.filter(x-> x <0).count();
       System.out.println(count);
   }
}
