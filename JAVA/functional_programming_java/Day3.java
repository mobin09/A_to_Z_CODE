import java.util.List;

public class Day3 {
    public static void main(String[] args) {
        // Print only the even numbers
        List<Integer> nums = List.of(1,3,2,7,4,10,13,22);
        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
