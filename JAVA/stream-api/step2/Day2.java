import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Set;

public class Day2 {
    public static void main(String[] args) {
        // list start here
        List<Employee> list = List.of(
             new Employee("Mobin Arshad", 100000, "IT",
               Arrays.asList("Java", "Spring Boot", "React", "Postgres")
            ),
            new Employee("Mohit", 130000, "IT",
                Arrays.asList("Java", "Spring Boot", "Microservices")
            ),
            new Employee("Ateeb", 150000, "HR",
                Arrays.asList("Excel", "Documentation")
            ),
            new Employee("Ramesh", 1750000, "HR",
                Arrays.asList("Excel", "Hiring")
            ),
            new Employee("Suresh", 60000, "ADMIN",
                Arrays.asList("Accounting", "Payroll Processing")
            )
        );
        // list end here
      // ✅ mapping()  
      Map<String, List<String>>  departmentAndNmae = list.stream().collect(
            Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.mapping(Employee::getName, Collectors.toList())
            )
        );
      System.out.println(departmentAndNmae); 
      /*
        {
          HR=[Ateeb, Ramesh], 
          ADMIN=[Suresh], 
          IT=[Mobin Arshad, Mohit]
        }      
      */ 

     //✅ flatMapping() (Java 9+)
     Map<String, Set<String>> skillsByDept =  list.stream().collect(
         Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.flatMapping(e -> e.getSkills().stream(), Collectors.toSet())
         )
      );
    System.out.println(skillsByDept);  
    /*
       {
          HR=[Excel, Documentation, Hiring], 
          ADMIN=[Accounting, Payroll Processing], 
          IT=[Java, Spring Boot, Postgres, React, Microservices]
        }    
    */



    }
}
