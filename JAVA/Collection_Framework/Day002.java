import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.NavigableSet;
public class Day002 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();        

        set.add(10);
        set.add(20);
        set.add(10);

        IO.println(set.size()); // 2
        IO.print(set);// [20,10] order unspecified
        IO.print(set.contains(20)); // true

        IO.println("\n");
        IO.println("SortedSet");

        SortedSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        IO.println(numbers); // [10,20,30,40,50]
        IO.println(numbers.first()); // 10
        IO.println(numbers.last()); // 50
        IO.println(numbers.headSet(30)); // [10,20]

        IO.println("\n");
        IO.println("Navigable Set");

        NavigableSet<Integer>  nums = new TreeSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        IO.println(nums.lower(30)); // 20
        IO.println(nums.floor(30)); // 30
        IO.println(nums.ceiling(35)); // 40
        IO.println(nums.higher(30)); // 40

        IO.println(nums.descendingSet()); // [50,40,30,20,10]


    }
}
