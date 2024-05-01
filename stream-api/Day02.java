import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Day02{
    public static void main(String[] args){
       List<Integer> list = new ArrayList<>();
       list.add(3000);
       list.add(30001);
       list.add(50001);
      Long x =  list.stream().filter((e )-> e > 3000).count();
      System.out.println(x);

      Stream<Integer> y  =  Stream.iterate(100, (n) -> n + 7).limit(5);
      y.forEach(n ->{
            System.out.println(n);
      });

    }
}