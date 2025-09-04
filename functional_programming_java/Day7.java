import java.util.List;
import java.util.stream.Collectors;
public class Day7 {
    public static void main(String[] args) {
        // print all course individually
        List<String> courses = List.of("Java", "Spring", "Spring Boot", "Microservices", "AWS", "Kubernetes", "Docker", "React", "DSA") ;
        courses.stream().forEach(System.out::println);
        // print the word containing the Spring
        System.out.println("The words containing the Spring");
        courses.stream().filter(c -> c.contains("Spring")).forEach(System.out::println);

        // print the word whose name is atleast 4 character.
        System.out.println("Name having length is > 4");
        courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);

        // print the number of character in each course
       List<Integer> courseLength = courses.stream()
               .map(course -> course.length())
               .collect(Collectors.toList());
          System.out.println(courseLength);     
    }
}
