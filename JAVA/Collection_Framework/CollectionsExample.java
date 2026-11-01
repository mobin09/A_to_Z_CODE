import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(30, 10, 20, 10));

        Collections.sort(list);
        System.out.println(list); // [10, 10, 20, 30]

        Collections.reverse(list);
        System.out.println(list); // [30, 20, 10, 10]

        Collections.swap(list, 0, 1);
        System.out.println(list); // [20, 30, 10, 10]

        System.out.println(Collections.min(list)); // 10
        System.out.println(Collections.max(list)); // 30

        System.out.println(
                Collections.frequency(list, 10)); // 2

        System.out.println(
                Collections.binarySearch(
                        Arrays.asList(10, 20, 30), 20)); // 1

        Collections.replaceAll(list, 10, 99);
        System.out.println(list); // [20, 30, 99, 99]

        Collections.rotate(list, 1);
        System.out.println(list); // [99, 20, 30, 99]
    }
}