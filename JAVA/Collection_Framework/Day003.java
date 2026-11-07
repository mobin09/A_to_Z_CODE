import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class Day003 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        
        names.add("Mobin");
        names.add("Mohit");
        names.add("Amit");
        names.add("Mobin");
        names.add(null);

        IO.println(names); // [Mohit, null, Mobin, Amit]

        IO.println(names.size()); // 4
        IO.println(names.contains("Mohit")); // true

        names.remove("Amit");

        IO.println(names); // [Mohit, null, Mobin]


        IO.println("\n");
        IO.println("LinkedHashSet");

        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        IO.println(numbers);// [30,10,20]

        Set<String> langs = new LinkedHashSet<>();
        
        langs.add("Java");
        langs.add("Python");
        langs.add("JavaScript");
        langs.add("Java");

        for (String lang: langs){
            IO.println(lang);
        }

      /*
         Output::
         Java
         Python
         JavaScript
      */

    IO.println();
    IO.println("CopyOnWriteArraySet");

    CopyOnWriteArraySet<String> namesList = new CopyOnWriteArraySet<>();
    namesList.add("Java");
    namesList.add("Spring");
    namesList.add("Kafka");
    namesList.add("Java");

    IO.println(namesList); // [Java, Spring, Kafka]
    for(String name: namesList){
        IO.println(name);
    }

    /*
     Java
     Spring
     Kafka
    
    */
        
  // Thread Safe Set
  Set<String> syncSet = Collections.synchronizedSet(new HashSet<>());
  CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();

  IO.println("\n");
  IO.println("Set Operations");

  Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
  Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6));

  // Union
  Set<Integer> union = new HashSet<>(set1);
  union.addAll(set2);
  IO.println(union); // [1, 2, 3, 4, 5, 6]

  //Intersections
  Set<Integer> intersections = new HashSet<>(set1);
  intersections.retainAll(set2);
  IO.println(intersections); // [3,4]
  
  // Differences
  Set<Integer> diff = new HashSet<>(set1);
  diff.removeAll(set2);
  IO.println(diff); // [1,2]

 ArrayList<String> list = new ArrayList<>();
 
 list.add("A");
 list.add("B");
 list.add("C");

 Iterator<String> it = list.iterator();
 while(it.hasNext()){
    IO.print(it.next());

    //list.add("D"); // ConcurrentModificationException
 }

 IO.println("\n");
 IO.println("Tree Set");

 Set<Integer> nums = new TreeSet<>();
 nums.add(50);
 nums.add(10);
 nums.add(40);
 nums.add(20);
 nums.add(30);
 nums.add(20);
 IO.println(nums); //[10, 20, 30, 40, 50]


Set<Integer> reverseNum = new TreeSet<>(Comparator.reverseOrder());
reverseNum.add(10);
reverseNum.add(50);
reverseNum.add(20);
reverseNum.add(30);

IO.println(reverseNum);





    }

}
