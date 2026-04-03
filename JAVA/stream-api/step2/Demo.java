import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public void m1(){
        System.out.println("AB");
    }

    public static void main(String[] args) {

        //list =

        list.stream()
        .sorted(Comparator.comparing(Emplouee::getSalary).thenComparing(Emplouee::getName)).collect(Collectors.toList());

        
                
    }
}



class Emplouee {
    String name;
    Integer salary;
    Integer id;

    public Emplouee(String name, Integer salary, Integer id){
         this.name = name;
         this.salary =  salary;
         this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }


}




