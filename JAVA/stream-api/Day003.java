import java.util.List;

public class Day003 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        int sum = nums.stream().reduce(0, Integer::sum); // 15
        long count = nums.stream().count(); // 5
        int max = nums.stream().max(Integer::compare).get(); // 5       
        boolean allPositive = nums.stream().allMatch(n -> n > 0); // true

    }
}
