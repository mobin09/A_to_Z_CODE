package step1;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class Day004 {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0,10)
                             .boxed()
                             .collect(Collectors.toList());
         list.parallelStream()
             .filter(n -> n % 2 ==0)
             .forEach(System.out::println);                    
    }
}
