import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Queue;
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override 
    public int hashCode(){
        return Objects.hashCode(this.id);
    }

    @Override 
    public boolean equals(Object obj){
        if(this == obj) return true;

        if(! (obj instanceof Employee)) return false;

        Employee other = (Employee)obj;
        return this.id == other.id;
    }


    @Override 
    public String toString(){
        return this.id + ":" + this.name;
    }

    public static void main(String[] args){
            Set<Employee> set = new HashSet<>();
            set.add(new Employee(101, "Mobin Arshad"));
            set.add(new Employee(102, "Mohit"));
            set.add(new Employee(101, "Updated Mobin"));

            System.out.println(set.size()); // 2
            System.out.println(set); //[101:Mobin Arshad, 102:Mohit]

    }
}
