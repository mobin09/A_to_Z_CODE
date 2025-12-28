import java.util.List;
import java.util.stream.Collectors;

public class Day6 {
    public static void main(String[] args) {
        // print odd numbers from the list
        List<Integer> list = List.of(1,7,8,20,25,0,13);
        list.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
        List<Integer> newList = list.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
        System.out.println(newList);
    }
}
