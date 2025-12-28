package step1;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Day01{
    public static void main(String[] args) {
          List<String> cities = List.of("RahmatNagar","Salempur", "Deoria", "Gorakhpur", "Lucknow", 
          "Kanpur", "Agra", "Noida", "Baralley", "MjafarPur", "Varansi", "New Delhi");
          Stream<String> cityStream = cities.stream();
          // filter out the name that is start with the n or N
         //startsWith
         //
        List<String> cityWithN =  cityStream.filter(e ->  e.toLowerCase().startsWith("n") ).collect(Collectors.toList());
        System.out.println(cityWithN);      

        List<String> name = List.of("Mobin", "Washim", "Nadim", "Jashim", "Mahira", "Fahad", "Aliza");
        List<String> newName = name.stream().filter(e -> e.toLowerCase().endsWith("a")).collect(Collectors.toList());
        System.out.println(newName);


       List<Integer> num = List.of(10,5, 7,9, 8, 20);
       List<Integer> newum =  num.stream().map(e -> e * e).collect(Collectors.toList());
       System.out.println(newum);

       

      // sorted
      num.stream().sorted().forEach(System.out::println); 
      System.out.println("1 -> Reversed Order Sorting");
      
      num.stream().sorted((e1,e2) -> e1 < e2 ? 1 : e1 > e2 ? -1 : 0).forEach(System.out::println);
      
      System.out.println("2 -> Reversed Order Sorting");
      num.stream().sorted((e1, e2) -> - e1.compareTo(e2)).forEach(System.out::println);
   

      Integer y = num.stream().sorted((e1,e2) -> -e1.compareTo(e2)).skip(1).findFirst().orElse(0);
      System.out.println("Second max from array: " +  y);


      Integer x =  num.stream().sorted().skip(1).findFirst().orElse(0);
      System.out.println(x);




      System.out.println("Finding the Minimum elements");
      Integer min = num.stream().min((e1, e2) -> e1.compareTo(e2)).get();
      System.out.println(min);

      System.out.println("Finding the Maximum element");
      Integer max = num.stream().max((e1, e2) -> e1.compareTo(e2)).get();
      System.out.println(max);

       




    }
}