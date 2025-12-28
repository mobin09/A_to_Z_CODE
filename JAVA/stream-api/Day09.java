import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Set;

public class Day09 {
    public static void main(String[] args) {
        List<Student1> list = Arrays.asList(
            new Student1("CSE", 19, "Mobin"),
            new Student1("CSE", 20, "Mohit"),
            new Student1("ME", 19, "Deepak"),
            new Student1("ECE", 18, "Chadni"),
            new Student1("ECE", 21, "Prashant")
        );

       //✅ groupingBy()
       Map<String, List<Student1>> mapList =  list.stream().collect(
              Collectors.groupingBy(Student1::getBranch)
            );
       System.out.println(mapList);
       /*
          {
            CSE=[Student1@4e0e2f2a, Student1@73d16e93], 
            ECE=[Student1@659e0bfd, Student1@2a139a55], 
            ME=[Student1@15db9742]
          }
       */

      // 🔹 groupingBy with downstream collector
       Map<String, Long> mapCount= list.stream().collect(
              Collectors.groupingBy(
                Student1::getBranch,
                Collectors.counting()
            ));

      System.out.println(mapCount);
      /*
       {
         CSE=2, 
         ECE=2, 
         ME=1
       }
      */

     //🔹 groupingBy + averaging
     Map<String, Double> studentBranchAverageAge =  list.stream().collect(
         Collectors.groupingBy(
            Student1::getBranch,
            Collectors.averagingDouble(Student1::getAge)
         )
     );
     System.out.println(studentBranchAverageAge);
     /*
        {
          CSE=19.5, 
          ECE=19.5, 
          ME=19.0
        }
     */

    //🔹 groupingBy + mapping (ADVANCED)
    Map<String, List<String>> branchNameList = list.stream().collect(Collectors.groupingBy(
         Student1::getBranch,
         Collectors.mapping(Student1::getName, Collectors.toList())
    ));
    System.out.println(branchNameList);
    /*
       {
         CSE=[Mobin, Mohit], 
         ECE=[Chadni, Prashant], 
         ME=[Deepak]
        }
    */

    //🔹 groupingBy with custom Map
    Map<String, Set<Student1>> mapSet =  list.stream().collect(Collectors.groupingBy(
        Student1::getBranch,
        HashMap::new,
        Collectors.toSet()
    ));
    System.out.println(mapSet);
    /*
      {
        CSE=[Student1@73d16e93, Student1@4e0e2f2a], 
        ECE=[Student1@659e0bfd, Student1@2a139a55], 
        ME=[Student1@15db9742]
      }
    
    */

    }
}
