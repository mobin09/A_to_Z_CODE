import java.util.EnumSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class Day004 {
     public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> numbers = new ConcurrentSkipListSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        IO.println(numbers); // [10,20,30,40,50]
        IO.println(numbers.first()); // 10
        IO.println(numbers.last()); // 50
        IO.println(numbers.ceiling(25)); // 30
        IO.println(numbers.floor(25)); //20


        IO.println("\n");
        IO.println("Enum Set");

        EnumSet<Days>  workingDays = EnumSet.of(
            Days.Monday,
            Days.Tuesday,
            Days.Wednesday,
            Days.Thursday,
            Days.Friday
        );

        IO.println(workingDays); 
        workingDays.add(Days.Saturday);

        IO.println(workingDays);

     }
}


enum Days {
    Monday, 
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}
