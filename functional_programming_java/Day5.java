import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;

public class Day5 {
    public static void main(String[] args) {
      String str = "HIIAMLEARNINGJAVASPRINGBOTTSPRINGMICROSERVICEDSA";
      Map<Character, Long> map =   str.chars()
        .mapToObj(c -> (char)c)
        .collect(Collectors.groupingBy(
             Function.identity(),
             Collectors.counting()
        ));
        System.out.println(map);
    
       List<Integer> lst = List.of(10,20,30);
       List<Integer> newList =  lst.stream().map(x -> x * 2).collect(Collectors.toList());
       System.out.println(newList);

    }
}