import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Day9 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango");
       Optional<String> OptionalStr =   fruits.stream()
                                              .filter(fruit -> fruit.startsWith("c"))
                                              .findFirst();
        System.out.println(OptionalStr);
        System.out.println(OptionalStr.isPresent());
        System.out.println(OptionalStr.isEmpty());
       // System.out.println(OptionalStr.get());

      Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);



    }
}
