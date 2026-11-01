import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class List1 {
    public static void main(String[] args){
        
        List<String> list = new ArrayList<>(List.of("Java", "Kafka", "Spring"));
        list.add(1, "Docker");
        IO.println(list); //[Java, Docker, Kafka, Spring]

        list.set(0, "Core Java");
        IO.println(list); //[Core Java, Docker, Kafka, Spring]

        list.remove(2);
        IO.println(list); //[Core Java, Docker, Spring]


        ArrayList<String> name  = new ArrayList<>();
        name.add("Mobin");
        name.add("Java");
        name.add("Spring Boot");
        
        IO.println(name.get(1)); // Java

        name.remove(0);
        IO.println(name); //[Java, Spring Boot]


        IO.println("\n");

        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Palnning");
        tasks.add("Coding");
        tasks.add("Executing");

        IO.println(tasks); //[Palnning, Coding, Executing]

        tasks.removeFirst();
        IO.println(tasks); //[Coding, Executing]


        IO.println("VECTOR");

        Vector<Integer> nums = new Vector<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        IO.println(nums.get(0)); //10

        nums.remove(0);
        IO.println(nums); // [20, 30]


        IO.println("\n");
        IO.println("Stack");

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        IO.println(stack.peek()); // 30
        IO.println(stack.pop()); // 30
        IO.println(stack.peek()); // 20

        IO.println("\n");

        Deque<Integer> stack2 = new ArrayDeque<>();
        
        stack2.push(10);
        stack2.push(20);
        
        IO.println(stack2.pop()); // 20

        IO.println();

        CopyOnWriteArrayList<String> lists = new CopyOnWriteArrayList<>();
        lists.add("Java");
        lists.add("Spring Boot");
        
        Iterator<String> it = lists.iterator();

        lists.add("Kafka");

        while(it.hasNext()){
            IO.println(it.next());
        }

        IO.println(lists);

    }
}
