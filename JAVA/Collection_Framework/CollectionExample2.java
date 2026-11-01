import java.util.*;

public class CollectionExample2 {
    public static void main(String[] args) {
        Collection<Integer> numbers =
                new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers.size());        // 3
        System.out.println(numbers.isEmpty());     // false
        System.out.println(numbers.contains(20));  // true

        numbers.remove(10);
        numbers.removeIf(n -> n > 20);

        System.out.println(numbers); // [20]

        numbers.clear();
        System.out.println(numbers.isEmpty()); // true
    }
}