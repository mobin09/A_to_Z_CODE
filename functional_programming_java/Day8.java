import java.util.List;
import java.util.stream.Collectors;

public class Day8 {
    public static void main(String[] args) {
         List<Integer> numbers = List.of(10,7,8,9,14);
         // make square of even numbers
       List<Integer> result =  numbers.stream()
                                      .filter(num -> num % 2 ==0)
                                      .map(num -> num * num)
                                      .collect(Collectors.toList());
       System.out.println("Square of even number is:::");
       System.out.println(result);

       System.out.println("Cube of Odd number is");
       List<Integer> cubeList =  numbers.stream()
                                        .filter(num -> num % 2 != 0)
                                        .map(num -> num * num * num)
                                        .collect(Collectors.toList());
       System.out.println(cubeList);
       
    }
    
}
