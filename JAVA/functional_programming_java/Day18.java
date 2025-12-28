import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.ArrayList;

public class Day18 {
     public static void main(String[] args) {
        // [1,3,2,4,5,9]
         List<Integer> list =  Arrays.asList(1,3,2,4,5,9);
       list.stream().map(x -> x * 2).filter(x -> x % 2 != 0).sorted().forEach(System.out::println);

       Map<String, Integer> map = new HashMap<>();
       map.put("Maths", 90);
       map.put("Science", 99); 

       map.entrySet().stream().forEach(x -> System.out.println(x.getKey() + "::" + x.getValue()));



 List<String> lst = new ArrayList<>();

lst.add("ABC");
System.out.println(lst); 

System.out.println(10+20 + "Java");
System.out.println("Java" + 10 + 20);
       
     }
}
