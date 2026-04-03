import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Day3 {
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

        // find the higest salary of employ
        Integer emp1 = list.stream()
                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
                    .map(e -> e.getSalary())
                    .findFirst().orElse(null);
        System.out.println(emp1);// 1750000
        
        
        // find the second higest salary 
       Employee emp2 =  list.stream()
             .sorted(Comparator.comparing(e -> ((Employee) e).getSalary()).reversed())
             .skip(1)
             .findFirst()
             .orElse(null);
       System.out.println(emp2.getSalary());// 150000 

       // find the higest salary of each department
       Map<String, Integer> map1 = list.stream().collect(Collectors.groupingBy(
           Employee::getDepartment,
           Collectors.collectingAndThen(
            Collectors.toList(),
            lst -> lst.stream()
                      .map(e -> e.getSalary()).sorted((e1,e2) -> - e1.compareTo(e2))
                      .findFirst()
                      .get()
        )
       ));

       System.out.println(map1);
       /*
         { 
           HR=1750000, 
           ADMIN=60000, 
           IT=130000
         }
       */

     // find the second higest salary of each employee
     Map<String, Integer> seconHigest = list.stream().collect(
         Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.collectingAndThen(
                Collectors.toList(),
                lst -> lst.stream()
                          .sorted(Comparator.comparing(Employee::getSalary).reversed())
                          .skip(1)
                          .map(e -> e.getSalary())
                          .findFirst()
                          .orElse(null)
            )
         ));

        System.out.println(seconHigest);
        /*
          {
            HR=150000, 
            ADMIN=null, 
            IT=100000
          }

        */

    }
}
