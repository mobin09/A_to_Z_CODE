import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Day4 {
    public static void main(String[] args) {
        List<String> list = List.of("Amit", "Deepa", "Rahul", "Akhil");
        // Map<Character, >
      Map<Character, List<String>> result =   list.stream().collect(
            Collectors.groupingBy(
                 name -> name.charAt(0),

                 Collectors.collectingAndThen(
                    Collectors.toList(), 
                    lst -> lst.stream().collect(Collectors.toList())
                    )
           )
        );
        System.out.println(result);
    }
}
