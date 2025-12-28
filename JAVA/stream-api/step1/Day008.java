package step1;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.Map;

public class Day008 {
    public static void main(String[] args) {
        List<Integer> listNum = Stream.of(1,2,2,3,4,7).collect(Collectors.toList());
        //System.out.println(listNum); // [1, 2, 2, 3, 4, 7]

        Set<Integer> setNum =  Stream.of(1,2,2,3,4,7).collect(Collectors.toSet());
        //System.out.println(setNum); // [1, 2, 3, 4, 7]

       Map<Integer, String> map =  Stream.of("Java", "Spring", "Boot")
             .collect(
                Collectors.toMap(
                    String::length,
                    str -> str,
                    (oldVal, newVal) -> newVal
                )
            );
       // System.out.println(map); // {4=Boot, 6=Spring}

       // joining
       String result = Stream.of("Java", "Stream", "API").collect(Collectors.joining(" "));
       //System.out.println(result); //Java Stream API

       String resVal = Stream.of("Spring", "Spring Boot", "Microservices").collect(Collectors.joining(",", "[", "]"));
       //System.out.println(resVal); //[Spring,Spring Boot,Microservices]

      
      String str = "I want to be a master in Java Full Stack Development that includes Java, Spring, Spring Boot, AWS, React, DevOps and React Native along with DSA and System Design";
      Map<Character, Long> mapCon =   str.toLowerCase().chars().mapToObj(c -> (char) c).filter(x -> x != ' ' &&  x != ',').collect(Collectors.groupingBy(
          Function.identity(),
          Collectors.counting()
      ));
      System.out.println(mapCon);
      /* 
          { 
            a=17, 
            b=2, 
            c=4, 
            d=7, 
            e=12, 
            f=1, 
            g=4, 
            h=2, 
            i=8, 
            j=2, 
            k=1, 
            l=5, 
            m=3, 
            n=11, 
            o=6, 
            p=4, 
            r=5, 
            s=11, 
            t=13, 
            u=2, 
            v=5, 
            w=3, 
            y=1}
        
      */
    }
}
