import java.util.Arrays;
import java.util.List;

public class Day4 {
    public static void main(String[] args) {
      List<Integer> numbers =  Arrays.asList(11,22,33,44);
      // sequential processing
      long sStartTime = System.currentTimeMillis();
      numbers.stream()
             .map(val -> val * val)
             .forEach(System.out::println);
     long sEndTIme = System.currentTimeMillis();
     System.out.println("Sequential time taking::" + (sEndTIme - sStartTime));    
     
     // parallel processing
     long pStartTime = System.currentTimeMillis();
     numbers.parallelStream()
            .map(val -> val * val)
            .forEach(x -> System.out.println(x));
     long pEndTIme = System.currentTimeMillis();
     System.out.println("Parallel processing time taking::" + (pEndTIme - pStartTime)); 
     /*
       121
       484
       1089
       1936
       Sequential time taking::4
       1089
       1936
       484
       121
       Parallel processing time taking::3
     */      
    }
}
