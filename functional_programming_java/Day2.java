import java.util.List;

public class Day2 {

    private static void print(int num){
        System.out.println("Nums is::" + num);
    }
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,4,7,8,9,25,56);
        nums.stream().forEach(Day2::print); // method reference
        nums.stream().forEach(System.out::println);

    }
}
