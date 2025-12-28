import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       List<Employee> list = Arrays.asList(
           new Employee("Maheera Mobin Khan", 2),
           new Employee("Aliza Ashraf Khan", 9),
           new Employee("Fahad Ashraf Khan", 11),
           new Employee("Jashim Arshad Khan", 16),
           new Employee("Nadeem Arshad Khan", 19),
           new Employee("Washim Arshad Khan", 22),
           new Employee("Mobin Arshad Khan", 26),
           new Employee("Vicky", 22),
           new Employee("Jaid", 19),
           new Employee("Nafish", 22)
       );

      List<Employee> sortedEmployee  = list.stream()
       .sorted(
        Comparator.comparing(Employee::getAge)
        .reversed()
       ).collect(Collectors.toList());

       System.out.println(sortedEmployee);
       /*
      [  
          Name: Mobin Arshad Khan, age: 26, 
          Name: Washim Arshad Khan, age: 22, 
          Name: Vicky, age: 22, 
          Name: Nafish, age: 22, 
          Name: Nadeem Arshad Khan, age: 19, 
          Name: Jaid, age: 19, 
          Name: Jashim Arshad Khan, age: 16, 
          Name: Fahad Ashraf Khan, age: 11, 
          Name: Aliza Ashraf Khan, age: 9, 
          Name: Maheera Mobin Khan, age: 2]
       */
   

    }
}
