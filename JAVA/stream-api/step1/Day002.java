package step1;

import java.util.List;
import java.util.stream.Collectors;

public class Day002 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "Bob");
        List<String> list = names.stream()
                                .filter(name -> name.length() > 3)
                                .distinct()
                                .sorted()
                                .peek(System.out::println)
                                .collect(Collectors.toList());

    }
}
