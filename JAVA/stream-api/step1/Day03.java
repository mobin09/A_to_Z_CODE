package step1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day03 {
    public static void main(String[] args){
        List<List<String>> list = Arrays.asList(
               Arrays.asList("I", "LOVE", "JAVA"),
               Arrays.asList("CONCEPT", "ARE", "CLEAR"),
               Arrays.asList("ITS", "VERY", "EASY")
        );

       Stream<String>  stream =  list.stream().flatMap(word-> word.stream());
       List<String> lowerWord  = stream.map(e -> e.toLowerCase()).collect(Collectors.toList());
       System.out.println(lowerWord);

       Integer[] arr = {1,5,2,7,4,4,2,0,9};
       List<Integer> distinctElements =  Arrays.stream(arr).distinct().collect(Collectors.toList());;
       System.out.println(distinctElements);
      
       Integer[] arr1 = {1,5,2,7,4,4,2,8,9};
       List<Integer> sortedArr =  Arrays.stream(arr1).sorted().collect(Collectors.toList());
       System.out.println(sortedArr);
     
      // we can also put the Comparable and Comparator operator
      List<Integer> sortedInDescending =  Arrays.stream(arr1).sorted((e1,e2) -> - e1.compareTo(e2)).collect(Collectors.toList());
      System.out.println(sortedInDescending);

      // get the third highest element from the arr
      Integer thirdmax = Arrays.stream(arr1).sorted((e1, e2) -> -e1.compareTo(e2)).skip(2).findFirst().orElse(0);
      System.out.println(thirdmax);
     
      List<Integer> nums = Arrays.asList(2,1,3,4,6);
      List<Integer> num = nums.stream()
                              .filter(e -> e >2)
                              .peek(e -> System.out.println(e))
                              .map(e -> e - 1)
                              .collect(Collectors.toList());

       System.out.println(num);

       List<Integer> nums2 = Arrays.asList(2,1,3,4,6);
       List<Integer> x=  nums2.stream().limit(3).collect(Collectors.toList());
       System.out.println(x);
       
      // skip the first n elements of the stream
      List<Integer> nums3 = Arrays.asList(2,1,3,4,6);
      List<Integer> y =  nums3.stream().skip(3).collect(Collectors.toList());
      System.out.println(y);

      List<Integer> nums4 = Arrays.asList(2,1,4,7,10);
      Stream<Integer> xm = nums4.stream().filter(e -> e >= 3).peek(e -> System.out.println(e));
      long cnt = xm.count();

    } 
}
