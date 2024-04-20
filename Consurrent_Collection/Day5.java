
import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Day5 {
    public static void main(String[] args) {
      // 1  
      Stream<Object> empStream =   Stream.empty(); // empty stream
      empStream.forEach(x -> System.out.println(x));
    // 2
      String[] name = {"Mobin", "Washim", "Nadim", "Jashim", "Fahad"};
      Stream<String> stream =  Stream.of(name); // of stream
      stream.forEach(System.out::println);
    //3
    Stream<Object> stream3 = Stream.builder().build();
    
    // 4
    Integer[] arr = new Integer[]{10, 20, 30, 40};
    Stream<Integer> stream4 = Arrays.stream(arr);
    stream4.forEach(System.out::println);

   // 5
   IntStream intStream = Arrays.stream(new int[]{10,20,30});
   intStream.forEach(System.out::println);

   // 6
   List<Integer> list = new ArrayList<>();
   list.add(10);
   list.add(100);
   list.add(1000);
   list.add(10000);

   Stream<Integer> stream6 = list.stream();
   stream6.forEach(System.out::println);
   
   DoubleStream stream7 =    Arrays.stream(new double[]{10.5, 20.20});
   stream7.forEach(System.out::println);
   
    }
}
