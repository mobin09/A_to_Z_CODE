import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class Day17 {
     public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi", "grape", "banana");  
        // List<String> result =   words.stream().
        //    sorted((str1, str2) ->  -Integer.valueOf(str1.length()).compareTo(Integer.valueOf(str2.length())))
        //    .limit(3).collect(Collectors.toList());

        //  System.out.println(result);  
    
     String max = words.stream().max((str1, str2) -> Integer.valueOf(str1.length()).compareTo(Integer.valueOf(str2.length()))).get();
     System.out.println(max);

     String min = words.stream().min((str1, str2) -> Integer.valueOf(str1.length()).compareTo(Integer.valueOf(str2.length()))).get();
     System.out.println(min);

     List<String> lst = words.stream().distinct().collect(Collectors.toList());
   
      List<A> listA =  List.of(new A("A", "Apple"), new A("B", "Banana"), new A("B", "Boy"));

    //  Map<String, List<String>> mapList =  
    
   Map<String, List<String>> mapList =  listA.stream().collect(Collectors.groupingBy(
           A::getKey,
           Collectors.collectingAndThen(
            Collectors.toList(), 
           list -> list.stream().map(x -> x.getVal()).collect(Collectors.toList())
           )
       ));

       System.out.println(mapList);
    

     }
}


class A {
 String  key;
  String val;

  public A(String key, String val){
    this.key = key;
    this.val = val;
  }

  String getKey(){
    return key;
  }

  String getVal(){
    return val;
  }
}
