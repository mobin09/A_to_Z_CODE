// package step2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Day01 {
    public static void main(String[] args) {
        List<Employee>  listOfEmployee = Arrays.asList(
            new Employee("Mobin Arshad", 100000, "IT"),
            new Employee("Mohit", 130000, "IT"),
            new Employee("Ateeb", 150000, "HR"),
            new Employee("Ramesh", 1750000, "HR"),
            new Employee("Suresh", 60000, "ADMIN")
        );

      Map<Boolean, List<Employee>> map1= listOfEmployee.stream().collect(Collectors.partitioningBy(emp -> emp.getSalary() >= 120000));
      System.out.println(map1);
/*
    {
        false=[Employee@58644d46, Employee@14dad5dc], 
        true=[Employee@18b4aac2, Employee@764c12b6, Employee@c387f44]
    }
*/

    }
}
