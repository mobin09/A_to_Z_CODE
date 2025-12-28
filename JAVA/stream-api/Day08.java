import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.List;

public class Day08 {
     public static void main(String[] args) {
       IntStream intStream =  Arrays.stream(new int[]{1,2,3});
       //intStream.forEach(System.out::println);
       
       DoubleStream doubleStream = Arrays.stream(new double[]{10.5, 15.75, 20.20});
       //doubleStream.forEach(System.out::println); 
    
      List<String> cities = List.of("RN", "Noida", "New Delhi", "Banglore");
      List<String> filterCities =  cities.stream().filter(c -> c.toLowerCase().startsWith("n")).collect(Collectors.toList());
      //System.out.println(filterCities); // [Noida, New Delhi]
      
      List<String> filteredList =  cities.stream().filter(c -> c.toLowerCase().endsWith("e")).collect(Collectors.toList());
     //System.out.println(filteredList); // [Banglore]

     List<Integer> nums = List.of(10, 5, 7, 9, 8,20);
     // find min
     int min = nums.stream().min(Integer::compareTo).get();
     //System.out.println(min); //5
     // find max
     int max = nums.stream().max(Integer::compareTo).get();
     //System.out.println(max); // 20
     // sorted list
     List<Integer> sortedList = nums.stream().sorted(Integer::compare).collect(Collectors.toList());
     //System.out.println(sortedList); //[5, 7, 8, 9, 10, 20]
     // reverse sorted list
     List<Integer> reversedList =  nums.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).collect(Collectors.toList());
     //System.out.println(reversedList); // [20, 10, 9, 8, 7, 5]

     // find the second max
     int smax = nums.stream().sorted((e1, e2) -> -e1.compareTo(e2)).skip(1).findFirst().orElse(0);
     //System.out.println(smax); //10


     List<Integer> list = List.of(3000, 3001, 5002);
     long x = list.stream().filter(n -> n > 3000).count();
     //System.out.println(x); // 2
     
     Stream<Integer> y = Stream.iterate(100, (n) -> n+7).limit(5);
     //y.forEach(System.out::println);
     /*
      100
      107
      114
      121
      128
     */

     List<List<String>> complexList = Arrays.asList(
         List.of("I", "LOVE", "JAVA"),
         List.of("CONCEPT", "ARE", "CLEAR"),
         List.of("ITS", "VERY", "EASY")
     );

    List<String> singleList = complexList.stream()
           .flatMap(lst -> lst.stream())
           .map(e -> e.toLowerCase())
           .collect(Collectors.toList());
    //System.out.println(singleList);// [i, love, java, concept, are, clear, its, very, easy]

    List<Integer> numList = Arrays.asList(2,1,3,4,6);
    List<Integer> newNimList = numList.stream()
           .filter(n -> n > 2)
           .peek(System.out::println)
           .map(e -> e-1)
           .collect(Collectors.toList());
    //System.out.println(newNimList);       
   /*
       3
       4
       6
       [2,3,5]
   
   */
  
       // conver to int[] arr
       List<Integer> intList = List.of(10, 7, 8, 9,4,5);
       int[] arr = intList.stream().mapToInt(Integer::intValue).toArray();
       //System.out.println(Arrays.toString(arr)); // [10, 7, 8, 9, 4, 5]

       List<Integer> numbers = Arrays.asList(2,1,4,7,10);
       Stream<Integer> nuStream  = numbers.stream().filter(n -> n >= 3).peek(System.out::println);
       
       //nuStream.count();
       /*
          o/p
          4
          7
          10
       */

      List<Integer> listNums = Arrays.asList(2,1,4,7,10);
      Stream<Integer> filteredListNum = listNums.stream()
                                              .filter(n -> n >=3);
      //filteredListNum.forEach(System.out::println);
      // consumed the filteredListNum stream

      //trying to use the closed stream again
     // filteredListNum.count();
      /*
         Exception in thread "main" java.lang.IllegalStateException: 
          stream has already been operated upon or closed
      */


    }
}
