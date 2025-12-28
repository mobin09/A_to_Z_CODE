import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day006 {
     public static void main(String[] args) {
        List<String> cityList = Arrays.asList("New Delhi", "Mumbai",
                   "Rahmat Nagar", "Gorakhpur","Deoria", "Banglore");

        List<String> filterCity= cityList.stream()
                                        .filter(city -> city.length() >= 7)
                                        .map(city -> city.toUpperCase())
                                        .collect(Collectors.toList());
        System.out.println(filterCity);
        //[NEW DELHI, RAHMAT NAGAR, GORAKHPUR, BANGLORE]
        System.out.println("City Filtered");

        List<Integer> listNum = Arrays.asList(10, 0, 15, 5, 20);
        List<Integer> res = listNum.stream().sorted().collect(Collectors.toList());
        System.out.println(res);
        // [0, 5, 10, 15, 20]
        System.out.println("Sorted List is::" + res);


        List<Integer> nums = Arrays.asList(10, 0, 15, 5, 20);
        List<Integer> result = nums.stream().sorted((a, b) -> -a.compareTo(b)).collect(Collectors.toList());
        System.out.println(result);
        //[20, 15, 10, 5, 0]
        System.out.println("Reverse Order List::" + result);
        System.out.println("\n");
        
        // For min and max we have comparator to sort the element.
        int min = nums.stream().min((a, b) -> a.compareTo(b)).get();
        int max = nums.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println(min); // 0
        System.out.println(max); // 20
        System.out.println("Min Max End");

        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(0);
        al.add(15);
        al.add(5);
        al.add(20);
        
       Object[] objArr =  al.stream().toArray();
       System.out.println(Arrays.toString(objArr));//[10, 0, 15, 5, 20]

       Integer[] arrInteger = al.stream().toArray(Integer[]::new);
       System.out.println(Arrays.toString(arrInteger)); // [10, 0, 15, 5, 20]

       int[] arrInt = al.stream().mapToInt(Integer::intValue).toArray();
       System.out.println(Arrays.toString(arrInt)); // [10, 0, 15, 5, 20]

       List<String> listStr = Arrays.asList("Mobin", "Maheera", "Washim", "Nadeem", "Jasim");
       String[] strArr = listStr.stream().toArray(String[]::new);
       System.out.println(Arrays.toString(strArr)); // [Mobin, Maheera, Washim, Nadeem, Jasim]

       System.out.println("\n");

       Stream<Integer> s = Stream.of(99, 999, 9999, 99999);
       s.forEach(System.out::println);
       
       Double[] d = {10.0, 10.1, 10.2, 10.3};
       Stream<Double> s1 = Stream.of(d);
       s1.forEach(System.out::println);


     }
}
