import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Alice", "Bob", "Charlie", "Charlie", "Bob");

       List<String> lst =  names.stream().collect(Collectors.groupingBy(
            str -> str,
            Collectors.counting()            
        )).entrySet().stream().sorted
        (Comparator.comparing((Map.Entry<String, Long>m1) -> m1.getValue())
        .reversed()
        .thenComparing((Map.Entry<String, Long>m) -> m.getKey()))
        .map((Map.Entry<String, Long> m) -> m.getKey() +"(" + m.getValue() + ")")
        .collect(Collectors.toList());
        System.out.println(lst);
    
 /* 
Output:
[
  "Alice (3)",
  "Bob (3)",
  "Charlie (2)"
]
 */       

   }    
}

