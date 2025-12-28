package step1;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Day007 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 40,7,9);
        //Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
        //System.out.println(sum.get()); //86

        // sum with identity
       int x =  Stream.of(1,2,3,4,5).reduce(0, (a ,b) -> a + b);
       //System.out.println(x); // 15


       // Sum of length of String
       int lengthOfString = Stream.of("Mobin", "Maheera", "Munni").reduce(
        0,
        (sum, str) -> sum + str.length(),
        (a, b) -> a+b
       );
       //System.out.println(lengthOfString); // 17

       int sumofString = Stream.of("Mobin", "Maheera", "Munni").
       reduce(
          0,
          (sum, str) -> sum + str.length(),
          Integer::sum
       );
       //System.out.println(sumofString); //17

	//✅ Example 1: Product of numbers
      int product = Stream.of(7,6,5,12).reduce(1, (a,b) -> a * b);
      //System.out.println(product); // 2520
    //✅ Example 2: Maximum value      
      Optional<Integer> max = Stream.of(7,6,5,12).reduce(Integer::max);
      //System.out.println(max.get()); // 12
    //✅ Example 3: String concatenation
      String result = Stream.of("Java", "Stream", "API").reduce("", String::concat);
     // System.out.println(result);// JavaStreamAPI

    //✅ Example 4: Sum of salaries (objects)  
    List<Employee> empList = Arrays.asList(
        new Employee(8.7),
        new Employee(1.3),
        new Employee(1.5)
    );

    double totalSalary = empList.stream().map(e -> e.salary).reduce(0.0, (a,b) -> a+b);
    //System.out.println(totalSalary); // 11.5
    } 
}
