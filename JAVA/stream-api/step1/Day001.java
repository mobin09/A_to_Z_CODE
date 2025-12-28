package step1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day001 {
    public static void main(String[] args) {
      List<Integer> list = Arrays.asList(0, 5,10,7,20);
      List<Integer> l = list.stream()
      .filter( num -> num % 2 ==0)
      .collect(Collectors.toList());

      l.forEach(System.out::println);

    }
}
