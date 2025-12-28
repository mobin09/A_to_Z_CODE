// import java.util.Arrays;
// import java.util.List;
// import java.util.Map;
// import java.util.Optional;
// import java.util.stream.Collectors;

// import java.util.Iterator;

// import java.util.Set;

// public class Day07{
//     public static void main(String[] args) {
//        List<Employee> list = Arrays.asList( 
//             new Employee(10, "IT", "Mobin Arshad"),
//             new Employee(15, "IT", "Tamjeed"),
//             new Employee(25, "IT", "Atiq"),
//             new Employee(10, "Teacher", "Javed"),
//             new Employee(5, "Mechanical", "Xyz"),
//             new Employee(15, "Teacher", "Shyam"),
//             new Employee(35, "Teacher", "Mohit"),
//             new Employee(45, "IT", "Deepak"),
//             new Employee(15, "Mechanical", "Ram"),
//             new Employee(35, "Mechanical", "Sundar")
//             );   

      
      
//     Map<String, Employee> m =list.stream().collect(Collectors.groupingBy(
//         emp -> emp.getDepartment(),
//         Collectors.collectingAndThen(
//             Collectors.toList(), 
//             empList -> empList.stream().sorted((x,y) -> -x.getSalary().compareTo(y.getSalary())).skip(1).findFirst().get()
//             )
//         ));
      
//         Set<String>  set =  m.keySet();
//         Iterator<String> it  = set.iterator();
//         while(it.hasNext()){
//            String key =  (String)it.next();
//            Employee em =  m.get(key);
//            System.out.println("Employee Name::" + em.getName() + ",Department" + key + ", Salary::" + em.getSalary());
//         }

//     }
// }


//  class Employee {
//     private Integer salary;
//     private String department;
//     private String name;

//     public Employee(Integer salary, String department,  String name){
//         this.salary = salary;
//         this.department = department;
//         this.name = name;
//     }

//     public Integer getSalary(){
//         return salary;
//     }
//     public String getDepartment(){
//         return department;
//     }

//     public String getName(){
//         return name;
//     }

// }