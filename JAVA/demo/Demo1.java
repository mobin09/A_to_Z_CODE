import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        String str = "aaabbdce";
       String result =  str.chars().mapToObj(x -> (char)x).collect(Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
        )).entrySet().stream().map(
            m -> m.getKey() + ":" + m.getValue() ).collect(Collectors.joining(","));

        System.out.println(result);
    }
}


// 10000, 
// 100
// 100

// int[] arr = new int[10];
// int[] arr1 = new int[10 + 10*0.75]; 0.75
// 

// 

// @Query("ssqkdjsksk kdjs (limit, off)", nativeQuery = true)

// 