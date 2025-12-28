package step1;

import java.util.List;
import java.util.stream.Collectors;

public class Day005 {
    public static void main(String[] args) {
       List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Bob");
       List<String> filterValue =  names.stream()
                                        .filter(n -> n.length() > 3) // intermediate
                                        .distinct() // intermediate
                                        .sorted() // intermediate
                                        .peek(System.out::println) // intermediate
                                        .limit(3) // intermediate
                                        .collect(Collectors.toList()); // terminal
    }
}
