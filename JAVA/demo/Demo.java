import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // map key String, val List of String
        Map<String, List<String>> map = new HashMap<>();
        map.put("City", List.of("Delhi", "Mumbai"));
        map.put("lang", List.of("Englis", "Hindi"));

        Stream<String> lst =   map.values().stream().flatMap( list -> list.stream());
        lst.filter(str -> str.contains("e")).forEach(System.out::println);
       /*
          Delhi
       */

       map.entrySet()
       .stream()
       .flatMap(entry -> entry.getValue().stream())
       .filter(str -> str.contains("e"))
       .forEach(System.out::println);



    }
}
