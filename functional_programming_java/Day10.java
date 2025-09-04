import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Day10 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>((a,b) -> -a.compareTo(b));
        set.add(10);
        set.add(20);
        set.add(3);
        set.add(-7);
        System.out.println(set);


Set<String> set1 = new HashSet<>(Arrays.asList("a", "b"));
Set<String> set2 = new LinkedHashSet<>(Arrays.asList("b", "a"));

System.out.println(set1.equals(set2)); // true (content equality)
System.out.println(set1 == set2); // false (reference)

    }
}
